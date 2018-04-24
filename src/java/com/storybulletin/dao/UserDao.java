package com.storybulletin.dao;
import com.storybulletin.model.Login;
import com.storybulletin.model.UserInformation;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List; 
import java.util.Map;
import org.hibernate.HibernateException; 
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class UserDao {
    
    public static void main(String[] args) {
        UserDao userDao=new UserDao();
        userDao.getUser(8);
        //userDao.insertUser("honey11", "honey3011", "honeyshah301111@gmail.com", 1, 1, 1, 1, 0, 0);
       // userDao.updateClicks("lifestyle", 4);
    }
    
    public void updateClicks(String category,long userID){
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
                //System.out.println(date);
            tx=session.beginTransaction();
            String hql = "UPDATE UserInformation set "+category+"Clicks="+category+"Clicks+:a "  + 
                     "WHERE userInformationID= :userID";
            Query query = session.createQuery(hql);
            query.setInteger("a", 1);
            query.setLong("userID", userID);
            int result = query.executeUpdate();
            System.out.println(result);
            tx.commit();
            session.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    public long getcount() {
	String sql="select count(userInformationID) as cnt from UserInformation";
	SessionFactory factory=HibernateUtils.buildSessionFactory();
        Session session = factory.openSession();
        List<Long> result=null;
        long total=0;
        try{
            Query q = session.createQuery(sql); 
            result= (List<Long>)q.list();
            total=result.get(0);
            System.out.println(total);
        }catch (HibernateException e) {
            e.printStackTrace(); 
        }finally {
            session.close(); 
        }
        return total;
    }
   
    public List getUsers(int startIndex,int endIndex ){      
        SessionFactory factory=HibernateUtils.buildSessionFactory();
        Session session = factory.openSession();
        List<UserInformation> users=null;
        try{
            Query q = session.createQuery("from UserInformation"); 
            q.setFirstResult(startIndex);
            q.setMaxResults(endIndex);
            users= (List<UserInformation>)q.list();
            System.out.println("size:"+users.size());
            for(UserInformation user: users){
//                String firstName = user.getEmailID();
//                System.out.println(firstName);  
            }
            
        }catch (HibernateException e) {
            e.printStackTrace(); 
        }finally {
            session.close(); 
        }
        return users;
    }
    
    public Map getUser(long userID ){      
        SessionFactory factory=HibernateUtils.buildSessionFactory();
        Session session = factory.openSession();
        List<UserInformation> users=null;
        Map<String,Long> map=new HashMap();
        try{
            Query q = session.createQuery("from UserInformation where userInformationID=:userID"); 
            q.setLong("userID", userID);
            users= (List<UserInformation>)q.list();
            UserInformation user=users.get(0);
            System.out.println("size:"+users.size());
            System.out.println(users.get(0).getEmailID());
         
            map.put("sportsClicks", user.getSportsClicks());
            map.put("businessClicks",user.getBusinessClicks());
            map.put("politicsClicks",user.getPoliticsClicks());
            map.put("lifeStyleClicks",user.getLifeStyleClicks());
            map.put("worldClicks",user.getWorldClicks());
            map.put("TechnologyClicks",user.getTechnologyClicks());
            map=sortByValue(map);
            
            map.put("sports",(long)user.getSportsInterest());
            map.put("business",(long)user.getBusinessInterest());
            map.put("politics",(long)user.getPoliticsInterest());
            map.put("lifestyle",(long)user.getLifeStyleInterest());
            map.put("world",(long)user.getWorldInterest());
            map.put("technology",(long)user.getTechnologyInterest());
            
            printMap(map);
            
        }catch (HibernateException e) {
            e.printStackTrace(); 
        }finally {
            session.close(); 
        }
        return map;
    }
    
    public void insertUser(String username,String password,String emailID,int gender,int sports,int business,int lifestyle,int world,int politics,int technology){
        SessionFactory factory = HibernateUtils.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
            try{
                  tx = session.beginTransaction();
                  
                  UserInformation ui=new UserInformation();
                  
                  ui.setEmailID(emailID);
                  ui.setGender(gender);
                  ui.setBusinessInterest(business);
                  ui.setLifeStyleInterest(lifestyle);
                  ui.setPoliticsInterest(politics);
                  ui.setSportsInterest(sports);
                  ui.setWorldInterest(world);
                  ui.setTechnologyInterest(technology);
                  
                  ui.setBusinessClicks(business);
                  ui.setLifeStyleClicks(lifestyle);
                  ui.setPoliticsClicks(politics);
                  ui.setSportsClicks(sports);
                  ui.setWorldClicks(world);
                  ui.setTechnologyClicks(technology);
                  
                  long uid = (Long) session.save(ui); 
                  Login l=new Login();
                  l.setUserInformationID(uid);
                  l.setUsername(username);
                  l.setPassword(password);
                  long lid=(Long) session.save(l);
                  tx.commit();
                  System.out.println(ui.getEmailID()+" added..");
            }catch (HibernateException e) {
                 if (tx!=null) tx.rollback();
            }
            catch(Exception e){
                System.out.println(e);  
            }
        session.close();
    }
       
    private static Map<String, Long> sortByValue(Map<String, Long> unsortMap) {

        // 1. Convert Map to List of Map
        List<Map.Entry<String, Long>> list =
                new LinkedList<Map.Entry<String, Long>>(unsortMap.entrySet());

        // 2. Sort list with Collections.sort(), provide a custom Comparator
        //    Try switch the o1 o2 position for a different order
        Collections.sort(list, new Comparator<Map.Entry<String, Long>>() {
            public int compare(Map.Entry<String, Long> o1,
                               Map.Entry<String, Long> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        // 3. Loop the sorted list and put it into a new insertion order Map LinkedHashMap
        Map<String, Long> sortedMap = new LinkedHashMap<String, Long>();
        for (Map.Entry<String, Long> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        /*
        //classic iterator example
        for (Iterator<Map.Entry<String, Integer>> it = list.iterator(); it.hasNext(); ) {
            Map.Entry<String, Integer> entry = it.next();
            sortedMap.put(entry.getKey(), entry.getValue());
        }*/


        return sortedMap;
    }
    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey()
                    + " Value : " + entry.getValue());
        }
    }
}
