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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Honey Shah
 */
public class DetailNewsController extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            AnalyticsDao analyticsDao=new AnalyticsDao();
            analyticsDao.updateClicks();
            long newsID=Long.parseLong(request.getParameter("id"));
            NewsDao newsDao=new NewsDao();
            newsDao.updateViews(newsID);
            FetchNews news=newsDao.getSingleNews(newsID);
            HttpSession session=request.getSession();
            session.setAttribute("singleNews", news);
            out.print(news.getNewsHeading());
            response.sendRedirect("view/DetailedNews.jsp");
        }
    }
}
