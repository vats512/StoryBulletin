package com.storybulletin.dao;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.hibernate.SessionFactory;
import com.jaunt.Element;
import com.jaunt.Elements;
import com.jaunt.NotFound;
import com.jaunt.ResponseException;
import com.jaunt.UserAgent;
import com.storybulletin.model.FetchNews;
import com.storybulletin.model.News;
import com.storybulletin.model.NewsDetail;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Honey Shah
 */
public class NewsDao {
    
     private static SessionFactory factory; 
     public static void main(String[] args) {
      NewsDao ME = new NewsDao();
//     ME.getNews("business","ANI",10);
//     ME.getNews("india", 0, 10);
//     ME.getSingleNews(432);
//      ME.mostViewed();
        String a="<div class=\"article_category\"><a href=\"#\">INDIA <i class=\"fa fa-angle-right\"></i></a><a href=\"#\">TOI <i class=\"fa fa-angle-right\"></i></a><a href=\"#\">2017-04-24</a></div>\n" +
"                                <h2 class=\"article_titile\">Five Indians jailed, fined in Singapore for fraud GST claims</h2>\n" +
"                                <p></p><p>\n" +
"\n" +
"  SINGAPORE: Five Indians, who were part of a syndicate, were jailed and fined in <a class=\"key_underline\" href=\"http://www.happytrips.com/topic/singapore\" rel=\"nofollow\">Singapore</a> on Monday for making fraudulent <a class=\"key_underline\" href=\"http://timesofindia.indiatimes.com/topic/goods-and-services\">goods and services</a> tax (GST) refund claims amounting to over $120,000.\n" +
"  </p><p>\n" +
"  </p><p>\n" +
"  They were jailed for making fraudulent GST refund claims amounting to Singaporean dollars 167,253 between January 2015 and May last year.\n" +
"  </p><p>\n" +
"  </p><p>\n" +
"  Kothandaraman Gnanam, 29, Karunanidhi Rajesh, 32, Ramaiyan Karthikeyan, 44, and Waithiyalingam Karunanidhi, 61, were jailed for three years and three months.\n" +
"  </p><p>\n" +
"  </p><p>\n" +
"  Their accomplice, Karunanithi Saravanan, 37, was jailed for three years and two months, the Strait Times reported.\n" +
"  </p><p>\n" +
"  </p><p>\n" +
"  They were also fined between 14,000 Singaporean dollars ($10,052) and 70,000 Singaporean dollars ($50,262). Each man also had to fork out 51,952 Singaporean dollars ($37,303) as a penalty.\n" +
"  </p><p>\n" +
"  </p><p>\n" +
"  However, only 5,434 Singaporean dollars worth of tax refunds made to the five men have been recovered.\n" +
"  </p><p>\n" +
"  </p><p>\n" +
"  The court heard that the men loitered in and around jewellery shops in 'Little India' area to obtain invoices and jewellery tags from customers, who were Singapore permanent residents and work pass holders, not entitled to GST refunds.\n" +
"  </p><p>\n" +
"  </p><p>\n" +
"  They would buy the invoices from the customers but no mention was made on the amount they paid for each invoice.\n" +
"  </p><p>\n" +
"  </p><p>\n" +
"  Tourists visiting Singapore can claim GST refunds on goods they have bought when they leave the country. They receive a receipt for goods purchased and an Electronic Tourist Refund Scheme (eTRS) ticket when they buy items from a GST-registered retailer.\n" +
"  </p><p>\n" +
"  </p><p>\n" +
"  They can then use the eTRS ticket to make GST refund claims at ports of departure such as the <a class=\"key_underline\" href=\"http://timesofindia.indiatimes.com/topic/Changi-Airport\">Changi Airport</a>.\n" +
"  </p><p>\n" +
"  </p><p>\n" +
"  They can also make similar transactions using the credit cards which they had used to buy their goods.\n" +
"  </p><p>\n" +
"  </p><p>\n" +
"  The five men used their passports and white embarkation cards to obtain eTRS tickets from the respective shops using the receipts they had obtained.\n" +
"  </p><p>\n" +
"  </p><p>\n" +
"  They then matched the invoices, jewellery tags and eTRS tickets with the jewellery they already had at hand.\n" +
"  </p><p>\n" +
"  </p><p>\n" +
"  Saravanan also provided jewellery from his own wholesale purchases to his accomplices to help them make false claims.\n" +
"  </p><p>\n" +
"  </p><p>\n" +
"  The men would then claim eTRS GST cash refunds at the airport before flying off.\n" +
"  \n" +
"  \n" +
"  When there were not enough valuables to go around, they would share among themselves the same piece of jewellery.\n" +
"  \n" +
"  \n" +
"  Investigators from the Inland Revenue Authority of Singapore (Iras) arrested them on February 1, this year.\n" +
"  \n" +
"  \n" +
"  The men pleaded guilty last Friday to 14 GST-related charges involving 17,317 Singaporean dollars ($12,432) each. Each man also had between 198 and 235 similar charges taken into consideration during sentencing.\n" +
"  \n" +
"  \n" +
"  They also removed from Singapore a total of 112,924 Singaporean dollars ($80,630) which were ill-gotten gains from their criminal conduct. Each man pleaded guilty to between seven and 11 charges of removing money from the country.\n" +
"  </p><p>\n" +
"  \n" +
"\n" +
"</p>";
        int b=a.indexOf("<div");
        int c=a.indexOf("</div>");
        String k=a.substring(0,b)+a.substring(c+9);
//        k=k.replace("class=\"featured_nav1\"", "");
//        k=k.replace("<ul >","");
//        k=k.replace("</ul>", "");
//        //k=k.replaceAll("<li\\sclass=\"wow\\sfadeInDown\\sanimated\">", "");
//        k=k.replaceAll("</li>", "");
//        k=k.replace("<article\\sclass=\"featured_article\">", "");
         System.out.println(k);
         System.out.println("c:"+c);
         System.out.println(a.indexOf("<img"));
    
   }
    
    public List mostViewed(){
        Session session=null;
        Transaction tx=null;
        List<FetchNews> news=new ArrayList();
        try{
            factory=HibernateUtils.buildSessionFactory();
            session=factory.openSession();
            Calendar cal = Calendar.getInstance();
            Date date1=cal.getTime();
            String d1=  new SimpleDateFormat("yyyy-MM-dd").format(date1);
            cal.add(Calendar.DATE, -7);
            Date date2=cal.getTime();
            String d2=  new SimpleDateFormat("yyyy-MM-dd").format(date2);
            String hql="select new com.storybulletin.model.FetchNews( n.newsID,n.newsSourceName,n.newsType,n.newsHeading,n.link,n.fetchStatus,n.date,nd.newsDetailID,nd.detailNews,nd.imageLink)" +
                                    " from News n, NewsDetail nd " +
                                    "where n.newsID = nd.newsID and "+
                                    "n.date between '"+d2+"' and '"+d1+"' order by views desc";
            Query q=session.createQuery(hql);
            q.setMaxResults(10);
            news=(List<FetchNews>)q.list();
            System.out.println(news.size());
        }catch(Exception e){
            System.out.println(e);
        }
        return news;
    } 
     
    public void updateViews(long newsID){
        Transaction tx=null;
        Session session=null;
        try{
            factory=HibernateUtils.buildSessionFactory();
            session=factory.openSession();
            String hql = "UPDATE News set views=views+:a "  + 
                 "WHERE newsID= :newsID";
            tx=session.beginTransaction();
            Query query = session.createQuery(hql);
            query.setInteger("a", 1);
            query.setLong("newsID", newsID);
            int result = query.executeUpdate();
            System.out.println(result);
            tx.commit();
            session.close();
        }catch(Exception e){
        }
    }
     
    public List getNews(String category,String sourceName,int maxResult){
        factory = HibernateUtils.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
        List<FetchNews> n = session.createQuery(
                                    "select new com.storybulletin.model.FetchNews( n.newsID,n.newsSourceName,n.newsType,n.newsHeading,n.link,n.fetchStatus,n.date,nd.newsDetailID,nd.detailNews,nd.imageLink)" +
                                    " from News n, NewsDetail nd " +
                                    "where n.newsID = nd.newsID and n.fetchStatus=1 and n.newsType='"+category+"' "+
                                    "and n.newsSourceName='"+sourceName+"' order by n.newsID desc").setMaxResults(maxResult)
                      .list();
        for(FetchNews fn:n){
            System.out.println("djf");
        }
        return n;
   }
    
   public List getNews(String category,int maxResult){
        factory = HibernateUtils.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
        List<FetchNews> n = session.createQuery(
                                    "select new com.storybulletin.model.FetchNews( n.newsID,n.newsSourceName,n.newsType,n.newsHeading,n.link,n.fetchStatus,n.date,nd.newsDetailID,nd.detailNews,nd.imageLink)" +
                                    " from News n, NewsDetail nd " +
                                    "where n.newsID = nd.newsID and n.fetchStatus=1 and n.newsType='"+category+"' "+
                                    "order by n.newsID desc").setMaxResults(maxResult)
                      .list();
        for(FetchNews fn:n){
            System.out.println("djf");
        }
        return n;
   }
    
   public List getNews(String category,int start,int total){
        factory = HibernateUtils.buildSessionFactory();
        Session session = factory.openSession();
        List<FetchNews> news=null;
        try{ 
              Query q = session.createQuery(
                                    "select new com.storybulletin.model.FetchNews( n.newsID,n.newsSourceName,n.newsType,n.newsHeading,n.link,n.fetchStatus,n.date,nd.newsDetailID,nd.detailNews,nd.imageLink)" +
                                    " from News n, NewsDetail nd " +
                                    "where n.newsID = nd.newsID and n.fetchStatus in (1,2) and n.newsType='"+category+"' "+
                                    " order by n.newsID desc");
              q.setFirstResult(start);
              q.setMaxResults(total);
              news=(List)q.list();
              System.out.println(news.size());
        }catch (HibernateException e) {
            e.printStackTrace(); 
        }finally {
            session.close(); 
        }
        return news;
   }
   public FetchNews getSingleNews(long newsID){
        factory = HibernateUtils.buildSessionFactory();
        Session session = factory.openSession();
        FetchNews news=null;
        try{ 
              Query q = session.createQuery(
                                    "select new com.storybulletin.model.FetchNews( n.newsID,n.newsSourceName,n.newsType,n.newsHeading,n.link,n.fetchStatus,n.date,nd.newsDetailID,nd.detailNews,nd.imageLink)" +
                                    " from News n, NewsDetail nd " +
                                    "where n.newsID = nd.newsID and n.newsID="+newsID+""+
                                    " order by n.newsID desc");
              news=(FetchNews)q.list().get(0);
              System.out.println(news.getNewsID());
        }catch (HibernateException e) {
            e.printStackTrace(); 
        }finally {
            session.close(); 
        }
        return news;
   }
   public void addNewsDetails(){
        factory = HibernateUtils.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
        long newsID=0;
            try{
                Query q = session.createQuery("from News where fetchStatus=0"); 
                List<News> headline=q.list();
                System.out.println("size:"+headline.size());
                for(News h:headline){         
                    String newsSource=h.getNewsSourceName();
                    if(newsSource.equals("IE")){
                        int fetchStatus=1;
                        try{
                            newsID=h.getNewsID();
//                            System.out.println(h.getLink());
                            UserAgent ua=new UserAgent();
                            ua.visit(h.getLink());
                            Elements elements=ua.doc.findEach("<div class=full-details>").findEach("<p>");
//                            System.out.println(ols.size());
                            String text="";
                            ArrayList<String> list=new ArrayList<>();
                            for(int i=0;i<elements.size()-1;i++)
                            {
                                Element ol=elements.getElement(i);
                                text=text+ol.innerHTML();
                            }
                            text=text.replaceAll("\"", "");
                            text=text.replaceAll("'","");
                            text=text.replaceAll("'","&#039;");
                            text=text.replaceAll("Also\\sRead|","");
                            text=text.replaceAll("Also\\sread|","");
                            text=text.replaceAll("ALSO\\sREAD|","");
//                            text=text.replaceAll("\"","&quot;");
                            text=text.replaceAll("|","");
                            System.out.println(text);
                            String imageLink="";
                            try{
                                Element ols=ua.doc.findFirst("<span class=custom-caption>").findFirst("<img>");
                                imageLink=ols.getAt("src");
                                System.out.println("image link="+imageLink);
                            }
                            catch(NotFound e){
                                System.out.println(e);
                                fetchStatus=2;
                            }
                            NewsDetail n=new NewsDetail();
                            n.setDetailNews(text);
                            n.setImageLink(imageLink);
                            n.setNewsID(newsID);
                            tx = session.beginTransaction();
                            long id = (Long) session.save(n);
                            int result = updateNewsStatus(session,newsID,fetchStatus);
                            tx.commit();
                            
                        } 
                        catch(NotFound|ResponseException e){
                            System.out.println(e);
                            fetchStatus=3;
                            tx = session.beginTransaction();
                            int result = updateNewsStatus(session, newsID,fetchStatus);
//                            System.out.println(result);
                            tx.commit();
                        }
                    }
                    else if(newsSource.equals("ANI")){
                        int fetchStatus=1;
                        try{
                            newsID=h.getNewsID();
                            UserAgent ua=new UserAgent();
                            ua.visit(h.getLink());
                            Elements elements=ua.doc.findEach("<div class=big-img-box>").findEach("<p>");
//                            System.out.println(ols.size());
                            String text="";
                            ArrayList<String> list=new ArrayList<>();
                            for(int i=0;i<elements.size()-1;i++){
                                Element ol=elements.getElement(i);
                                text=text+"<p>";
                                text=text+ol.innerHTML();
                                text=text+"</p>";
                                //list.add(text);
                               // System.out.println("text:"+text);
                            }
                            text=text.replaceAll("\"", "");
                            text=text.replaceAll("'","");
                            text=text.replaceAll("'","&#039;");
                            text=text.replaceAll("(ANI)","");
                            text=text.replaceAll("[)(]","");
                            System.out.println(text);
                            String imageLink="";
                            try{
                                imageLink=ua.doc.findFirst("<div class=big-img-box>").findFirst("<img>").getAt("src");
                            }
                            catch(NotFound e){
                                fetchStatus=2;
                                System.out.println(e);
                            }
                            System.out.println("image link:"+imageLink);
                            NewsDetail n=new NewsDetail();
                            n.setDetailNews(text);
                            n.setImageLink(imageLink);
                            n.setNewsID(newsID);
                            tx = session.beginTransaction();
                            long id = (Long) session.save(n);
                            int result=updateNewsStatus(session, newsID, fetchStatus);
                            tx.commit();
                        }
                        catch(NotFound|ResponseException e){
                            System.out.println(e);
                            fetchStatus=3;
                            tx=session.beginTransaction();
                            int result=updateNewsStatus(session, newsID, fetchStatus);
                            tx.commit(); 
                        }
                    }
                    else if(newsSource.equals("reuters")){
                        int fetchStatus=1;
                        try{
                            newsID=h.getNewsID();
                            UserAgent ua=new UserAgent();
                            ua.visit(h.getLink());
                            Elements elements=ua.doc.findEach("<span id=article-text>").findEach("<p>");
//                            System.out.println(ols.size());
                            String text="";
                            for(int i=0;i<elements.size()-1;i++){
                                Element ol=elements.getElement(i);
                                text=text+"<p>";
                                text=text+ol.innerHTML();
                                text=text+"</p>";
                                text=text.replaceAll("\"", "");
                                text=text.replaceAll("'","");
				text=text.replaceAll("<span class=\"articleLocation\">", "");
				text=text.replaceAll("<span class=articleLocation>", "");
				text=text.replaceAll("</span>","");
				text=text.replaceAll("<span class=articleLocatio","");
                                //list.add(text);
                               // System.out.println("text:"+text);
                            }
                            System.out.println(text);
                            String imageLink="";
                            try{
                                imageLink=ua.doc.findFirst("<div class=related-photo-container>").findFirst("<img>").getAt("src");
                            }catch(NotFound e){
                                try{
                                   imageLink=ua.doc.findEach("<div class=module-slide-media>").findFirst("<img>").getAt("data-lazy");	
                                }catch(Exception e1){
                                    fetchStatus=2;
                                    System.out.println(e1); 
                                }
                            }
                            System.out.println("image link:"+imageLink);
                          
                            NewsDetail n=new NewsDetail();
                            n.setDetailNews(text);
                            n.setImageLink(imageLink);
                            n.setNewsID(newsID);
                            tx = session.beginTransaction();
                            long id = (Long) session.save(n);
                            int result=updateNewsStatus(session, newsID, fetchStatus);
                            tx.commit();
                        }
                        catch(NotFound|ResponseException e){
                            System.out.println(e);
                            fetchStatus=3;
                            tx=session.beginTransaction();
                            int result=updateNewsStatus(session, newsID, fetchStatus);
                            tx.commit(); 
                        }
                    }
                    else if(newsSource.equals("TOI")){
                        int fetchStatus=1;
                        try{
                            newsID=h.getNewsID();
                            UserAgent ua=new UserAgent();
                            ua.visit(h.getLink());
                            Elements elements=ua.doc.findEach("<div class=Normal>");
                            String text="<p>"+elements.getElement(0).innerHTML();
                           // text=text.replaceAll("last\\dbrdiv", "");
                            text=text.replaceAll("<div\\sclass=\"last\\dbrdiv\"></div><br>", "");
                            text=text.replaceAll("<br>", "<p>");
                            System.out.println(text);
                            String imageLink="";
                            try{
                                imageLink=ua.doc.findFirst("<section class=\"highlight clearfix\">").findFirst("<img>").getAt("src");
                            }
                            catch(NotFound e){
                                System.out.println(e);
                                fetchStatus=2;
                            }
                            System.out.println("image link:"+imageLink);
                            NewsDetail n=new NewsDetail();
                            n.setDetailNews(text);
                            n.setImageLink(imageLink);
                            n.setNewsID(newsID);
                            tx = session.beginTransaction();
                            long id = (Long) session.save(n);
                            int result=updateNewsStatus(session, newsID, fetchStatus);
                            tx.commit();
                        }
                        catch(NotFound|ResponseException e){
                            System.out.println(e);
                            fetchStatus=3;
                            tx=session.beginTransaction();
                            int result=updateNewsStatus(session, newsID, fetchStatus);
                            tx.commit(); 
                        }
                    }
                }
            }catch (HibernateException e) {
                 if (tx!=null) tx.rollback();
            }       
            catch(Exception e){
                System.out.println("e:"+e);
            }
    }
 
    public int updateNewsStatus(Session session,long newsID,int fetchStatus){
        String hql = "UPDATE News set fetchStatus = :fetchStatus "  + 
                                         "WHERE newsID = :newsID";
        Query query = session.createQuery(hql);
        query.setParameter("fetchStatus", fetchStatus);
        query.setParameter("newsID", newsID);
      //  tx = session.beginTransaction();
        int result = query.executeUpdate();
        System.out.println(result);
       // tx.commit();
        return result;
    }
    public void addNews(ArrayList<News> headlines){
        factory = HibernateUtils.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
        for(News h:headlines){
            try{
                  tx = session.beginTransaction();
                 
            String date=new SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date());
            
                  h.setDate(date);
                  long id = (Long) session.save(h); 
                  tx.commit();
                  System.out.println(h.getNewsHeading()+" added..");
            }catch (HibernateException e) {
                 if (tx!=null) tx.rollback();
            }
            catch(Exception e){}
               
        }
        session.close();
    }
}

