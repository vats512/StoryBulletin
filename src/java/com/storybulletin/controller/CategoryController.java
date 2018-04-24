/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.storybulletin.controller;

import com.storybulletin.dao.AnalyticsDao;
import com.storybulletin.dao.NewsDao;
import com.storybulletin.model.FetchNews;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Honey Shah
 */
public class CategoryController extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String category=request.getParameter("category");
            HttpSession session=request.getSession();
            AnalyticsDao analyticsDao=new AnalyticsDao();
            NewsDao newsDao=new NewsDao();
            analyticsDao.updateClicks();
            analyticsDao.updateClicks(category);
            if(session.getAttribute("userID")!=null){
                long userID=(long)session.getAttribute("userID");
                analyticsDao.updateClicks(userID);
            }
            if(category.equals("top")){
                category="india";
            }
            int page=Integer.parseInt(request.getParameter("page"));
            int totalNews=45;
            session.setAttribute("totalNews",totalNews);
            session.setAttribute("category", category);  
            session.setAttribute("page", page);
            int total=10;          
            if(page==1){}   
            else{  
                int pageid=page-1;  
                page=pageid*total+1;  
            } 
            List<FetchNews> news=newsDao.getNews(category,page-1,total);
            session.setAttribute("news", news);
            List<FetchNews> mostViewed=newsDao.mostViewed();
            session.setAttribute("mostViewed", mostViewed);
            response.sendRedirect("view/Category.jsp?category="+category);
        }
        catch(Exception e){
            out.print(e);
        }
    }
}
