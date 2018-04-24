/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.storybulletin.controller;

import com.storybulletin.dao.NewsDao;
import com.storybulletin.dao.UserDao;
import com.storybulletin.model.FetchNews;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Honey Shah
 */
public class PersonalizationController extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try  {
            UserDao userDao=new UserDao();
            HttpSession session=request.getSession();
            long userID=(long)session.getAttribute("userID");
           // out.print(userID);
            Map<String,Long> map=userDao.getUser(userID);
           // out.print(map.size());
            Set<String> keySet = map.keySet();
           // Iterator<String> iterator = keySet.iterator();
            NewsDao newsDao=new NewsDao();
            int i=0;
            int j=1;
            List<FetchNews> news1=new ArrayList<>();
            for(Map.Entry m:map.entrySet()){  
                if(i<6){
                    String a=(String)m.getKey(); 
                    a=a.replace("Clicks", ""); 
                    news1.addAll(newsDao.getNews(a, 10));
                    //session.setAttribute("rec"+(i+1), news);
                    i++;
                }
                else{
                   
                    if((long)m.getValue()==1){
                        String a=(String)m.getKey();
                        List news=newsDao.getNews(a, 10);
                        session.setAttribute("choice"+(j), news);
                        j++;
                    }
                   
                }
            }
            session.setAttribute("rec", news1);
             //out.print(j);
            response.sendRedirect("view/Client.jsp");
        }
        catch(Exception e){
            out.print(e);
        }
    }
}
