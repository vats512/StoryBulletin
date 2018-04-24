/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.storybulletin.controller;

import com.storybulletin.dao.HibernateUtils;
import com.storybulletin.model.Login;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Honey Shah
 */
public class LoginController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            Session se = HibernateUtils.buildSessionFactory().openSession();
            Transaction tr = se.beginTransaction();
            
            Criteria cr = se.createCriteria(Login.class);
            cr.add(Restrictions.eq("username", request.getParameter("username")));
            cr.add(Restrictions.eq("password", request.getParameter("password")));                          
            ArrayList<Login> al = (ArrayList<Login>)cr.list();
            if(al.size()>0)
            {
                HttpSession session = request.getSession(true); 
                Login l = al.get(0);
                session.setAttribute("userID", l.getUserInformationID());
                session.setAttribute("userName", l.getUsername());
                response.sendRedirect("NewsController"); 
            }
            else
            {
                out.println("Invalid UserName And Password");
            }
            tr.commit();
            
        }
    }
   
}
