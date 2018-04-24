package com.storybulletin.model;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
@Entity
@Table(name = "login")
@XmlRootElement
public class Login {  
   @Id 
   @GeneratedValue
   @Column(name = "LoginID")
   private long loginID;

   @Column(name = "UserInformationID")
   private Long userInformationID;

   @Column(name = "Username")
   private String username;

   @Column(name = "Password")
   private String password;
   
   @Column(name = "IsAdmin")
   private int isAdmin;

   public Login() {
   }

    public long getLoginID() {
        return loginID;
    }

    public void setLoginID(long loginID) {
        this.loginID = loginID;
    }

    public Long getUserInformationID() {
        return userInformationID;
    }

    public void setUserInformationID(Long userInformationID) {
        this.userInformationID = userInformationID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }
   
   
   
}