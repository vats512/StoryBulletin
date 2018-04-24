/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.storybulletin.controller;

import com.jaunt.Element;
import com.jaunt.Elements;
import com.jaunt.ResponseException;
import com.jaunt.UserAgent;
import com.storybulletin.dao.NewsDao;
import com.storybulletin.model.FetchNews;
import com.storybulletin.model.News;
import java.io.IOException;
import java.util.ArrayList;
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
public class NewsController extends HttpServlet {

  @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          
          HttpSession session=request.getSession();
          session.removeAttribute("REFRESH");
          if(session.getAttribute("userID")==null){
              response.sendRedirect("DefaultPageController");
          }
          else{
              response.sendRedirect("PersonalizationController");
          }
       
    }
    public void aniPolitics()throws Exception{
        UserAgent ua=new UserAgent();
	try
	{
		ua.visit("http://www.aninews.in/MTE/allnews/national/politics-news/politics.html");
		Elements ols=(Elements) ua.doc.findEach("<div class=heading33>").findEach("<a>");
                       
		//System.out.println(elements.innerHTML());
		//Elements ols = elements.findEach("<a>");
		ArrayList<News> h=new ArrayList<News>();
		System.out.println(ols.size());
		
		for(Element ol : ols){   
//                        System.out.println(ol.findFirst("<h2 class=story_title>").innerHTML());
//                        System.out.println(ol.getAt("href"));
//                       String s=ol.innerHTML();
//                       s=s.replaceAll("&#039;","'");
//                       System.out.println(s);
			News h1=new News();
			h1.setNewsHeading(ol.findFirst("<h2 class=story_title>").innerHTML());
			h1.setLink(ol.getAt("href"));
		        h1.setNewsSourceName("ANI");
			h1.setNewsType("politics");
			h.add(h1);
			
		  } 
                NewsDao n=new NewsDao();
		n.addNews(h);
		
	}
	 catch (ResponseException e) {
		e.printStackTrace();
	}
    }
    
    public void aniSports()throws Exception{
        UserAgent ua=new UserAgent();
	try
	{
		ua.visit("http://www.aninews.in/Ng/news/sports-news/sports.html");
		Elements ols=(Elements) ua.doc.findEach("<div class=heading33>").findEach("<a>");
                       
		//System.out.println(elements.innerHTML());
		//Elements ols = elements.findEach("<a>");
		ArrayList<News> h=new ArrayList<News>();
		System.out.println(ols.size());
		
		for(Element ol : ols){   
//                        System.out.println(ol.findFirst("<h2 class=story_title>").innerHTML());
//                        System.out.println(ol.getAt("href"));
//                       String s=ol.innerHTML();
//                       s=s.replaceAll("&#039;","'");
//                       System.out.println(s);
			News h1=new News();
			h1.setNewsHeading(ol.findFirst("<h2 class=story_title>").innerHTML());
			h1.setLink(ol.getAt("href"));
		        h1.setNewsSourceName("ANI");
			h1.setNewsType("sports");
			h.add(h1);
			
		  } 
                NewsDao n=new NewsDao();
		n.addNews(h);
		
	}
	 catch (ResponseException e) {
		e.printStackTrace();
	}
    }
    
    public void aniIndia()throws Exception{
        UserAgent ua=new UserAgent();
	try
	{
		ua.visit("http://www.aninews.in/Mg/news/national-news/national.html");
		Elements ols=(Elements) ua.doc.findEach("<div class=heading33>").findEach("<a>");
                       
		//System.out.println(elements.innerHTML());
		//Elements ols = elements.findEach("<a>");
		ArrayList<News> h=new ArrayList<News>();
		System.out.println(ols.size());
		
		for(Element ol : ols){   
//                        System.out.println(ol.findFirst("<h2 class=story_title>").innerHTML());
//                        System.out.println(ol.getAt("href"));
//                       String s=ol.innerHTML();
//                       s=s.replaceAll("&#039;","'");
//                       System.out.println(s);
			News h1=new News();
			h1.setNewsHeading(ol.findFirst("<h2 class=story_title>").innerHTML());
			h1.setLink(ol.getAt("href"));
		        h1.setNewsSourceName("ANI");
			h1.setNewsType("india");
			h.add(h1);
			
		  } 
                NewsDao n=new NewsDao();
		n.addNews(h);
		
	}
	 catch (ResponseException e) {
		e.printStackTrace();
	}
    }
    
    public void aniWorld()throws Exception{
        UserAgent ua=new UserAgent();
	try
	{
		ua.visit("http://www.aninews.in/NA/news/world-news/world.html");
		Elements ols=(Elements) ua.doc.findEach("<div class=heading33>").findEach("<a>");
                       
		//System.out.println(elements.innerHTML());
		//Elements ols = elements.findEach("<a>");
		ArrayList<News> h=new ArrayList<News>();
		System.out.println(ols.size());
		
		for(Element ol : ols){   
//                        System.out.println(ol.findFirst("<h2 class=story_title>").innerHTML());
//                        System.out.println(ol.getAt("href"));
//                       String s=ol.innerHTML();
//                       s=s.replaceAll("&#039;","'");
//                       System.out.println(s);
			News h1=new News();
			h1.setNewsHeading(ol.findFirst("<h2 class=story_title>").innerHTML());
			h1.setLink(ol.getAt("href"));
		        h1.setNewsSourceName("ANI");
			h1.setNewsType("world");
			h.add(h1);
			
		  } 
                NewsDao n=new NewsDao();
		n.addNews(h);
		
	}
	 catch (ResponseException e) {
		e.printStackTrace();
	}
    }
    
    public void aniBusiness()throws Exception{
        UserAgent ua=new UserAgent();
	try
	{
		ua.visit("http://www.aninews.in/Mw/news/business-news/business.html");
		Elements ols=(Elements) ua.doc.findEach("<div class=heading33>").findEach("<a>");
                       
		//System.out.println(elements.innerHTML());
		//Elements ols = elements.findEach("<a>");
		ArrayList<News> h=new ArrayList<News>();
		System.out.println(ols.size());
		
		for(Element ol : ols){   
//                        System.out.println(ol.findFirst("<h2 class=story_title>").innerHTML());
//                        System.out.println(ol.getAt("href"));
//                       String s=ol.innerHTML();
//                       s=s.replaceAll("&#039;","'");
//                       System.out.println(s);
			News h1=new News();
			h1.setNewsHeading(ol.findFirst("<h2 class=story_title>").innerHTML());
			h1.setLink(ol.getAt("href"));
		        h1.setNewsSourceName("ANI");
			h1.setNewsType("business");
			h.add(h1);
			
		  } 
                NewsDao n=new NewsDao();
		n.addNews(h);
		
	}
	 catch (ResponseException e) {
		e.printStackTrace();
	}
    }
    
    public void aniEntertainment()throws Exception{
        UserAgent ua=new UserAgent();
	try
	{
		ua.visit("http://www.aninews.in/NQ/news/entertainment-news/entertainment.html");
		Elements ols=(Elements) ua.doc.findEach("<div class=heading33>").findEach("<a>");
                       
		//System.out.println(elements.innerHTML());
		//Elements ols = elements.findEach("<a>");
		ArrayList<News> h=new ArrayList<News>();
		System.out.println(ols.size());
		
		for(Element ol : ols){   
//                        System.out.println(ol.findFirst("<h2 class=story_title>").innerHTML());
//                        System.out.println(ol.getAt("href"));
//                       String s=ol.innerHTML();
//                       s=s.replaceAll("&#039;","'");
//                       System.out.println(s);
			News h1=new News();
			h1.setNewsHeading(ol.findFirst("<h2 class=story_title>").innerHTML());
			h1.setLink(ol.getAt("href"));
		        h1.setNewsSourceName("ANI");
			h1.setNewsType("entertainment");
			h.add(h1);
			
		  } 
                NewsDao n=new NewsDao();
		n.addNews(h);
		
	}
	 catch (ResponseException e) {
		e.printStackTrace();
	}
    }
    public void TOIWorld()throws Exception{
        UserAgent ua=new UserAgent();
	try
	{
		ua.visit("http://timesofindia.indiatimes.com/world");
		Elements ols=(Elements) ua.doc.findEach("<div class=top-newslist>").findEach("<span class=w_tle>").findEach("<a>");
                       
		//System.out.println(elements.innerHTML());
		//Elements ols = elements.findEach("<a>");
		ArrayList<News> h=new ArrayList<News>();
		System.out.println(ols.size());
		
		for(Element ol : ols){   
                        System.out.println(ol.innerHTML());
                        System.out.println(ol.getAt("href"));
			News h1=new News();
			h1.setNewsHeading(ol.innerHTML());
			h1.setLink(ol.getAt("href"));
		        h1.setNewsSourceName("TOI");
			h1.setNewsType("world");
			h.add(h1);
			
		  } 
                NewsDao n=new NewsDao();
		n.addNews(h);
		
	}
	 catch (ResponseException e) {
		e.printStackTrace();
	}
    }
    public void TOIBusiness()throws Exception{
        UserAgent ua=new UserAgent();
	try
	{
		ua.visit("http://timesofindia.indiatimes.com/business");
		Elements ols=(Elements) ua.doc.findEach("<div class=top-newslist>").findEach("<span class=w_tle>").findEach("<a>");
		//System.out.println(elements.innerHTML());
		//Elements ols = elements.findEach("<a>");
		ArrayList<News> h=new ArrayList<News>();
		System.out.println(ols.size());
		
		for(Element ol : ols){   
                        System.out.println(ol.innerHTML());
                        System.out.println(ol.getAt("href"));
			News h1=new News();
			h1.setNewsHeading(ol.innerHTML());
			h1.setLink(ol.getAt("href"));
		        h1.setNewsSourceName("TOI");
			h1.setNewsType("business");
			h.add(h1);
			
		  } 
                NewsDao n=new NewsDao();
		n.addNews(h);
		
	}
	 catch (ResponseException e) {
		e.printStackTrace();
	}
    }
    public void TOITech()throws Exception{
        UserAgent ua=new UserAgent();
	try
	{
		ua.visit("http://www.gadgetsnow.com/?utm_source=toiweb&utm_medium=referral&utm_campaign=toiweb_hptopnav");
		Elements ols=(Elements) ua.doc.findEach("<ul id=topnews>").findEach("<span class=w_tle>").findEach("<a>");
                       
		//System.out.println(elements.innerHTML());
		//Elements ols = elements.findEach("<a>");
		ArrayList<News> h=new ArrayList<News>();
		//System.out.println(ols.size());
		
		for(Element ol : ols){   
                        System.out.println(ol.innerHTML());
                        System.out.println(ol.getAt("href"));
			News h1=new News();
			h1.setNewsHeading(ol.innerHTML());
			h1.setLink(ol.getAt("href"));
		        h1.setNewsSourceName("TOI");
			h1.setNewsType("technology");
			h.add(h1);
			
		  } 
                NewsDao n=new NewsDao();
		n.addNews(h);
		
	}
	 catch (ResponseException e) {
		e.printStackTrace();
	}
    }
    public void TOIIndia()throws Exception{
        UserAgent ua=new UserAgent();
	try
	{
		ua.visit("http://timesofindia.indiatimes.com/india");
		Elements ols=(Elements) ua.doc.findEach("<div id=artlist_posnxt>").findEach("<span").findEach("<a>");
                       
		//System.out.println(elements.innerHTML());
		//Elements ols = elements.findEach("<a>");
		ArrayList<News> h=new ArrayList<News>();
		//System.out.println(ols.size());
		
		for(Element ol : ols){   
                        System.out.println(ol.innerHTML());
                        System.out.println(ol.getAt("href"));
			News h1=new News();
			h1.setNewsHeading(ol.innerHTML());
			h1.setLink(ol.getAt("href"));
		        h1.setNewsSourceName("TOI");
			h1.setNewsType("india");
			h.add(h1);
			
		  } 
                NewsDao n=new NewsDao();
		n.addNews(h);
		
	}
	 catch (ResponseException e) {
		e.printStackTrace();
	}
    }
    public void TOISports()throws Exception{
        UserAgent ua=new UserAgent();
	try
	{
		ua.visit("http://timesofindia.indiatimes.com/sports");
		Elements ols=(Elements) ua.doc.findEach("<section class=news-widget>").
                        findEach("<div class=featuredimg>").findEach("<h2>").findEach("<a>");
                       
		//System.out.println(elements.innerHTML());
		//Elements ols = elements.findEach("<a>");
		ArrayList<News> h=new ArrayList<News>();
		//System.out.println(ols.size());
		
		for(Element ol : ols){   
                        System.out.println(ol.innerHTML());
                        System.out.println(ol.getAt("href"));
			News h1=new News();
			h1.setNewsHeading(ol.innerHTML());
			h1.setLink(ol.getAt("href"));
		        h1.setNewsSourceName("TOI");
			h1.setNewsType("sports");
			h.add(h1);
			
		  } 
                NewsDao n=new NewsDao();
		n.addNews(h);
		
	}
	 catch (ResponseException e) {
		e.printStackTrace();
	}
    }
    public void reutersEntertainment()throws Exception{
        UserAgent ua=new UserAgent();
	try
	{
		ua.visit("http://in.reuters.com/news/entertainment");
		Elements ols=(Elements) ua.doc.findFirst("<div id=moreSectionNews>").
                        findEach("<div class=moduleBody>"). findEach("<div class=feature>").findEach("<h2>").findEach("<a>");
		//System.out.println(elements.innerHTML());
		//Elements ols = elements.findEach("<a>");
		ArrayList<News> h=new ArrayList<News>();
		//System.out.println(ols.size());
		
		for(Element ol : ols){         
			News h1=new News();
			h1.setNewsHeading(ol.innerHTML());
			h1.setLink(ol.getAt("href"));
		        h1.setNewsSourceName("reuters");
			h1.setNewsType("entertainment");
			h.add(h1);
			
		  } 
                NewsDao n=new NewsDao();
		n.addNews(h);
		
	}
	 catch (ResponseException e) {
		e.printStackTrace();
	}
    }
    public void reutersLifestyle()throws Exception{
        UserAgent ua=new UserAgent();
	try
	{
		ua.visit("http://in.reuters.com/news/lifestyle");
		Elements ols=(Elements) ua.doc.findFirst("<div id=moreSectionNews>").
                        findEach("<div class=moduleBody>"). findEach("<div class=feature>").findEach("<h2>").findEach("<a>");
		//System.out.println(elements.innerHTML());
		//Elements ols = elements.findEach("<a>");
		ArrayList<News> h=new ArrayList<News>();
		//System.out.println(ols.size());
		
		for(Element ol : ols){         
                        System.out.println(ol.getAt("href"));
                        News h1=new News();
			h1.setNewsHeading(ol.innerHTML());
			h1.setLink(ol.getAt("href"));
			h1.setNewsSourceName("reuters");
			h1.setNewsType("lifestyle");
			h.add(h1);
		  } 
                NewsDao n=new NewsDao();
		n.addNews(h);
		
	}
	 catch (ResponseException e) {
		e.printStackTrace();
	}
    }
    
    public void reutersSports()throws Exception{
        UserAgent ua=new UserAgent();
	try
	{
		ua.visit("http://in.reuters.com/news/sports");
		Elements ols=(Elements) ua.doc.findFirst("<div class=\"more-section-news-top gridPanel grid8\">").
                        findEach("<div class=moduleBody>"). findEach("<div class=feature>").findEach("<h2>").findEach("<a>");
		//System.out.println(elements.innerHTML());
		//Elements ols = elements.findEach("<a>");
		ArrayList<News> h=new ArrayList<News>();
		//System.out.println(ols.size());
		
		for(Element ol : ols){         
			//System.out.println(ol.innerHTML());
			String s1=ol.innerHTML().replaceAll("'", "");
			s1=s1.trim();
                        System.out.println("s1:"+s1);
                        System.out.println(ol.getAt("href"));
			if(s1.contains("<img"))
			{
				
			}
			else
			{
				News h1=new News();
				h1.setNewsHeading(s1);
				h1.setLink(ol.getAt("href"));
				h1.setNewsSourceName("reuters");
				h1.setNewsType("sports");
				h.add(h1);
			}
		  } 
                NewsDao n=new NewsDao();
		n.addNews(h);
		
	}
	 catch (ResponseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public void reutersWorld() throws Exception{
        UserAgent ua=new UserAgent();
	try
	{
		ua.visit("http://in.reuters.com/news/world");
		Elements ols=(Elements) ua.doc.findFirst("<div class=\"more-section-news-top gridPanel grid8\">").
                        findEach("<div class=moduleBody>"). findEach("<div class=feature>").findEach("<h2>").findEach("<a>");
		//System.out.println(elements.innerHTML());
		//Elements ols = elements.findEach("<a>");
		ArrayList<News> h=new ArrayList<News>();
		//System.out.println(ols.size());
		
		for(Element ol : ols){         
			//System.out.println(ol.innerHTML());
			String s1=ol.innerHTML().replaceAll("'", "");
			s1=s1.trim();
                        System.out.println("s1:"+s1);
                        System.out.println(ol.getAt("href"));
			if(s1.contains("<img"))
			{
				
			}
			else
			{
				News h1=new News();
				h1.setNewsHeading(s1);
				h1.setLink(ol.getAt("href"));
				h1.setNewsSourceName("reuters");
				h1.setNewsType("world");
				h.add(h1);
			}
		  } 
                NewsDao n=new NewsDao();
		n.addNews(h);
		
	}
	 catch (ResponseException e) {
             e.printStackTrace();
         }

		
    }
    
    public void reutersTechnology()throws Exception{
        UserAgent ua=new UserAgent();
	try
	{
		ua.visit("http://in.reuters.com/news/technology");
		Elements ols=(Elements) ua.doc.findFirst("<div class=\"more-section-news-top gridPanel grid8\">").findEach("<div class=moduleBody>").
                                            findEach("<div class=feature>").findEach("<h2>").findEach("<a>");
		//System.out.println(elements.innerHTML());
		//Elements ols = elements.findEach("<a>");
		ArrayList<News> h=new ArrayList<News>();
		//System.out.println(ols.size());
		
		for(Element ol : ols){         
			//System.out.println(ol.innerHTML());
			String s1=ol.innerHTML().replaceAll("'", "");
			s1=s1.trim();
                        System.out.println("s1:"+s1);
                        System.out.println(ol.getAt("href"));
			if(s1.contains("<img"))
			{
				
			}
			else
			{
				News h1=new News();
				h1.setNewsHeading(s1);
				h1.setLink(ol.getAt("href"));
				h1.setNewsSourceName("reuters");
				h1.setNewsType("tehnology");
				h.add(h1);
			}
		  } 
                NewsDao n=new NewsDao();
		n.addNews(h);
		
	}
	 catch (ResponseException e) {
			e.printStackTrace();
		}
    }
    
    public void reutersIndia()throws Exception{
        UserAgent ua=new UserAgent();
        try{
        ua.visit("http://in.reuters.com/news/top-news");
		Elements ols=(Elements) ua.doc.findFirst("<div class=\"column1 gridPanel grid8\">").findEach("<div class=moduleBody>").
                                            findEach("<div class=feature>").findEach("<h2>").findEach("<a>");
		//System.out.println(elements.innerHTML());
		//Elements ols = elements.findEach("<a>");
		ArrayList<News> h=new ArrayList<News>();
		//System.out.println(ols.size());
		
		for(Element ol : ols){         
			//System.out.println(ol.innerHTML());
			String s1=ol.innerHTML().replaceAll("'", "");
			s1=s1.trim();
                       System.out.println("s1:"+s1);
                       //System.out.println(ol.getAt("href"));
			if(s1.contains("<img"))
			{
				
			}
			else
			{
				News h1=new News();
				h1.setNewsHeading(s1);
				h1.setLink(ol.getAt("href"));
				h1.setNewsSourceName("reuters");
				h1.setNewsType("india");
				h.add(h1);
			}
		  } 
                NewsDao n=new NewsDao();
		n.addNews(h);
		
	}
	 catch (ResponseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public void indianexpLifestyle()throws Exception{
        
                try{
            UserAgent ua=new UserAgent();
            ua.visit("http://indianexpress.com/lifestyle/");
		Elements elements=(Elements) ua.doc.findEach("<div class=story-heading>");
		//System.out.println(elements.innerHTML());
		Elements ols = elements.findEach("<a>");
		ArrayList<News> h=new ArrayList<News>();
		//System.out.println(ols.size());
		for(Element ol : ols){         
			//System.out.println(ol.innerHTML());
			String s1=ol.innerHTML().replaceAll("'", "");
			s1=s1.trim();
                        //System.out.println("s1:"+s1);
			if(s1.contains("<img"))
			{
				
			}
			else
			{
				News h1=new News();
				h1.setNewsHeading(s1);
				h1.setLink(ol.getAt("href"));
				h1.setNewsSourceName("IE");
				h1.setNewsType("lifestyle");
				h.add(h1);
                            System.out.println(s1);
			}
		  } 
                NewsDao n=new NewsDao();
                n.addNews(h);
        }
        catch(ResponseException e){
            System.out.println(e);
        }
        
    }
    
    public void indianexpEntertainment() throws Exception
{
	UserAgent ua=new UserAgent();
	try
	{
		ua.visit("http://indianexpress.com/section/entertainment/");
		Elements elements=(Elements) ua.doc.findEach("<div class=stories>");
		System.out.println(elements.innerHTML());
		Elements ols = elements.findEach("<a>");
		ArrayList<News> h=new ArrayList<News>();
		System.out.println(ols.size());
		
		for(Element ol : ols){         
			System.out.println(ol.innerHTML());
			String s1=ol.innerHTML().replaceAll("'", "");
			s1=s1.trim();
			if(s1.contains("<img"))
			{
				
			}
			else
			{
				News h1=new News();
				h1.setNewsHeading(s1);
				h1.setLink(ol.getAt("href"));
				h1.setNewsSourceName("IE");
				h1.setNewsType("entertainment");
				h.add(h1);
			}
		  } 
                NewsDao n=new NewsDao();
		n.addNews(h);
		
	}
	 catch (ResponseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        }

}
