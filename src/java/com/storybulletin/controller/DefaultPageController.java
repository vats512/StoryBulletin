/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.storybulletin.controller;

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
public class DefaultPageController extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            NewsDao newsDao=new NewsDao();
        
            List<FetchNews> sports=newsDao.getNews("sports","TOI",4);
            sports.addAll(newsDao.getNews("sports","reuters",3));   
            sports.addAll(newsDao.getNews("sports","ANI",3));

            List<FetchNews> india=newsDao.getNews("india","TOI",4);
            india.addAll(newsDao.getNews("india","reuters",3));
            india.addAll(newsDao.getNews("india","ANI",3));

            List<FetchNews> business=newsDao.getNews("business","TOI",5);
            business.addAll(newsDao.getNews("business","ANI",5));

            HttpSession session=request.getSession(true);
            session.setAttribute("choice1", sports);
            session.setAttribute("choice2", india);
            session.setAttribute("choice3", business);
            response.sendRedirect("view/Client.jsp");
        }
    }

}
