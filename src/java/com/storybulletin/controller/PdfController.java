/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.storybulletin.controller;

import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.storybulletin.service.iText;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Honey Shah
 */
public class PdfController extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try  {
            /* TODO output your page here. You may use following sample code. */
            String basepath="C:\\Users\\Honey Shah\\Documents\\NetBeansProjects\\StoryBulletinFinal\\Pdf";
            String a=request.getParameter("html_val_pdf");
            int k=a.indexOf("<div");
            int b=a.indexOf("</div>");
             a=a.substring(0,k)+a.substring(b+9);
//             a=a.replaceFirst("<a", "<h2>");
//             a=a.replaceFirst("</a>", "</h1>");
//             a=a.replaceAll("<a", "<b>");
//             a=a.replaceAll("</a>", "</b>");
             File input = new File(basepath+"\\page.html");
		FileWriter w=new FileWriter(input.getAbsoluteFile());
		BufferedWriter bw=new BufferedWriter(w);
		
		String HtmlString="<html><head><style>h2{text-decoration:underline}a{color:black;text-decoration:none}</style></head><body>"+a+"</body></html>";
		System.out.println(HtmlString);
		bw.write(HtmlString);
		bw.close();
		
		//creating unique name everytime for the pdf documentation name
		String fileName = new SimpleDateFormat("dd_MM_yyyy_hh_mm'.pdf'").format(new java.util.Date());
	
		System.out.println("filename  "+fileName);
		
		
		iText.createPdf(basepath+"\\"+fileName,basepath+"\\page.html");
                HttpSession session=request.getSession();
		session.setAttribute("file", basepath+"\\"+fileName);
                //request.getRequestDispatcher("DownloadFileServlet").forward(request, response);
	    response.sendRedirect("DownloadFileServlet");
            //out.print(HtmlString);
        }catch(Exception e){
            out.print(e);
        }
    }
}
