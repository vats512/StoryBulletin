/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.storybulletin.dao;

import com.storybulletin.model.Analytics;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Honey Shah
 */
public class AnalyticsDao {
    
    public static void main(String[] args) {
        AnalyticsDao analyticsDao=new AnalyticsDao();
       // System.out.println(analyticsDao.getDailyClicks());
       Date d=new Date();
        System.out.println(d.getHours());
        analyticsDao.updateClicks();
    }
    
    public void updateClicks(long userID){
        SessionFactory factory=null;
        Transaction tx=null;
        Session session=null;
        try{
            factory=HibernateUtils.buildSessionFactory();
            session = factory.openSession();
            Date date=new Date();
            String d=  new SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date());        
            String click="";
            String hql="";
            String gend="";
            hql="select gender from UserInformation where userInformationID= :userID";
            Query q=session.createQuery(hql);
            q.setLong("userID",userID);
            List<Integer> res=q.list();
            int gender=(int)res.get(0);
            if(gender==1){
                gend="Female";
            }
            else{
                gend="Male";
            }
            if(7<=date.getHours() && 15>date.getHours()){
                click="morning";
            }
            else if(15<=date.getHours() && 22>date.getHours()){
                click="noon";
            }
            else{
                click="night";   
            }       
            System.out.println(date);
            tx=session.beginTransaction();
            hql = "UPDATE Analytics set "+click+gend+"Clicks="+click+gend+"Clicks+:a "  + 
                 "WHERE date= :b";
            Query query = session.createQuery(hql);
            query.setInteger("a", 1);
            query.setString("b", d);
            int result = query.executeUpdate();
            System.out.println(result);
            tx.commit();
            session.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
    
    public void updateClicks(String category){
        SessionFactory factory=null;
        Transaction tx=null;
        Session session=null;
        try{
            factory=HibernateUtils.buildSessionFactory();
            session = factory.openSession();
            if(category.equals("top")){
                category="india";
            }
            else if(category.equals("lifestyle")){    
               category="lifeStyle";
            }
            category=category.substring(0, 1).toUpperCase()+category.substring(1);
            System.out.println(category);
            Date date=new Date();
            String click="";
            String d=  new SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date());        
            tx=session.beginTransaction();
            String hql = "UPDATE Analytics set "+category+"Clicks="+category+"Clicks+:a "  + 
                     "WHERE date= :date";
            Query query = session.createQuery(hql);
            query.setInteger("a", 1);
            query.setString("date",d);
            int result = query.executeUpdate();
            System.out.println(result);
            tx.commit();
            session.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
    
    public void updateClicks(){
        SessionFactory factory=HibernateUtils.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx=null;
        Date date=new Date();
        String click="";
        String d=  new SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date());
        System.out.println(d);
        Query q = session.createQuery("select analyticsID from Analytics where date='"+d+"'");  
        List<Object> l=q.list();
//        System.out.println(l.size());
//        System.out.println(q.getFetchSize());
        if(l.isEmpty()){
            Analytics a=new Analytics();
            tx=session.beginTransaction();
            a.setDate(d);
            long id=(long)session.save(a);
            tx.commit();
            System.out.println(id);
        }
        else{    
            String hql="";
            if(7<=date.getHours() && 15>date.getHours()){
                click="morningClicks";
            }
            else if(15<=date.getHours() && 22>date.getHours()){
                click="noonClicks";
            }
            else{
                click="nightClicks";   
            }       
            System.out.println(date);
            tx=session.beginTransaction();
            hql = "UPDATE Analytics set "+click+"="+click+"+:a "  + 
                 "WHERE date= :b";
            Query query = session.createQuery(hql);
            query.setInteger("a", 1);
            query.setString("b", d);
            int result = query.executeUpdate();
            System.out.println(result);
            tx.commit();
            session.close();
        }
    }
    
    public String getDailyClicks(){      
        SessionFactory factory=HibernateUtils.buildSessionFactory();
        Session session = factory.openSession();
        List<Integer[]> clicks;
        String dailyClicks="";
        try{
            Query q = session.createQuery("select morningCicks,noonClicks,nightClicks from Analytics where date= :date"); 
//            Query q = session.createQuery("from Analytics"); 
//            q.setString("date", new SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date()));
            q.setString("date", "2017-03-31");
            clicks= (List<Integer[]>)q.list();
            Object[] click=clicks.get(0);
            dailyClicks=click[0]+","+click[1]+","+click[2];    
        }catch (HibernateException e) {
            e.printStackTrace(); 
        }finally {
            session.close(); 
        }
        return dailyClicks;
    }
    
}
