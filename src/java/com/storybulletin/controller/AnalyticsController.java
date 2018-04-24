/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.storybulletin.controller;

import com.storybulletin.dao.AnalyticsDao;
import com.storybulletin.dao.UserDao;
import com.storybulletin.model.Analytics;
import com.storybulletin.model.UserInformation;
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
public class AnalyticsController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        AnalyticsDao analyticsDao=new AnalyticsDao();
        String dailyClicks=analyticsDao.getDailyClicks();
        HttpSession session=request.getSession(false);
        session.setAttribute("dailyClicks", dailyClicks);
        response.sendRedirect("view/Chart.jsp");
    }

    
}
