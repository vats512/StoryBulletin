/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.storybulletin.controller;

import com.storybulletin.dao.UserDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Honey Shah
 */
public class SignupController extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String username=request.getParameter("username");
            String password=request.getParameter("password");
            String emailID=request.getParameter("emailID");
            int gender=Integer.parseInt(request.getParameter("gender"));
            String[] categories=request.getParameterValues("categories");
            int politics=0;
            int sports=0;
            int lifestyle=0;
            int business=0;
            int world=0;
            int technology=0;
            for(String c:categories){
                switch(c){
                    case "politics":
                        politics=1;
                        break;
                        
                    case "sports":
                        sports=1;
                        break;
                        
                    case "lifestyle":
                        lifestyle=1;
                        break;
                        
                    case "business":
                        business=1;
                        break;
                       
                    case "world":
                        world=1;
                        break;
                    
                    case "technology":
                        technology=1;
                        break;
                }
            }
//            out.print(username);
//            out.print(emailID);
//            out.print(password);
//            out.print(gender);
//            out.print(business);
//            out.print(sports);
//            out.print(politics);
//            out.print(lifestyle);
//            out.print(world);
            UserDao ud=new UserDao();
            ud.insertUser(username, password, emailID, gender, sports, business, lifestyle, world, politics,technology);
            response.sendRedirect("view/Login.jsp");
        }catch(Exception e){
            out.print(e);
        }
    }


}
