/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.storybulletin.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.storybulletin.dao.UserDao;
import com.storybulletin.model.UserInformation;
import java.util.List;

/**
 *
 * @author Honey Shah
 */
public class UserInformationController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        UserDao userDao=new UserDao();
        long count=userDao.getcount();
        HttpSession session=request.getSession();
        session.setAttribute("count", userDao.getcount());
        String spageid=request.getParameter("page"); 
        int pageid=1;
        if(spageid!=null){
            pageid=Integer.parseInt(spageid);
        }  
        int total=5;          
        if(pageid==1){} 
        else{  
            int pageid1=pageid-1;  
            pageid=pageid1*total+1;  
        }  
        List<UserInformation> users=userDao.getUsers(pageid-1,total);
        session.setAttribute("users", users);
//        for(int i=0;i<users.size();i++){
//            UserInformation user=users.get(i);
//        }
       response.sendRedirect("view/Users.jsp");
    }

    

}
