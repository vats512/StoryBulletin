/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.storybulletin.dao;

import com.storybulletin.model.UserInformation;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author Honey Shah
 */
public class HibernateUtils {
    private static SessionFactory factory=buildSessionFactory(); 

    public static SessionFactory buildSessionFactory() {
      try{   
         factory = new AnnotationConfiguration().
                   configure().
                   addAnnotatedClass(UserInformation.class).
                   buildSessionFactory();
      }catch (Throwable ex) { 
         System.err.println("Failed to create sessionFactory object." + ex);
         throw new ExceptionInInitializerError(ex); 
      }
      return factory;
   }
    
}
