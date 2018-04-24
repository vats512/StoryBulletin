package com.storybulletin.model;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
@Entity
@Table(name = "userinformation")
@XmlRootElement
public class UserInformation {  
   @Id 
   @GeneratedValue
   @Column(name = "UserInformationID")
   private long userInformationID;
   
   @Column(name = "Gender")
   private int gender;
   
   @Column(name = "EmailID")
   private String emailID;

   @Column(name = "SportsClicks")
   private long sportsClicks; 
 
   @Column(name = "PoliticsClicks")
   private long politicsClicks;
   
   @Column(name = "BusinessClicks")
   private long businessClicks;
   
   @Column(name = "LifeStyleClicks")
   private long lifeStyleClicks; 
   
   @Column(name = "WorldClicks")
   private long worldClicks;
   
   @Column(name = "TechnologyClicks")
   private long technologyClicks;
   
   @Column(name = "SportsInterest")
   private int sportsInterest; 
 
   @Column(name = "PoliticsInterest")
   private int politicsInterest;
   
   @Column(name = "BusinessInterest")
   private int businessInterest;
   
   @Column(name = "LifeStyleInterest")
   private int lifeStyleInterest; 
   
   @Column(name = "WorldInterest")
   private int worldInterest;

   @Column(name="TechnologyInterest")
   private int technologyInterest;
   
    public long getUserInformationID() {
        return userInformationID;
    }

    public void setUserInformationID(long userInformationID) {
        this.userInformationID = userInformationID;
    }

    
    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public long getSportsClicks() {
        return sportsClicks;
    }

    public void setSportsClicks(long sportsClicks) {
        this.sportsClicks = sportsClicks;
    }

    public long getPoliticsClicks() {
        return politicsClicks;
    }

    public void setPoliticsClicks(long politicsClicks) {
        this.politicsClicks = politicsClicks;
    }

    public long getBusinessClicks() {
        return businessClicks;
    }

    public void setBusinessClicks(int businessClicks) {
        this.businessClicks = businessClicks;
    }

    public long getLifeStyleClicks() {
        return lifeStyleClicks;
    }

    public void setLifeStyleClicks(long lifeStyleClicks) {
        this.lifeStyleClicks = lifeStyleClicks;
    }

    public long getWorldClicks() {
        return worldClicks;
    }

    public void setWorldClicks(long worldClicks) {
        this.worldClicks = worldClicks;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getSportsInterest() {
        return sportsInterest;
    }

    public void setSportsInterest(int sportsInterest) {
        this.sportsInterest = sportsInterest;
    }

    public int getPoliticsInterest() {
        return politicsInterest;
    }

    public void setPoliticsInterest(int politicsInterest) {
        this.politicsInterest = politicsInterest;
    }

    public int getBusinessInterest() {
        return businessInterest;
    }

    public void setBusinessInterest(int businessInterest) {
        this.businessInterest = businessInterest;
    }

    public int getLifeStyleInterest() {
        return lifeStyleInterest;
    }

    public void setLifeStyleInterest(int lifeStyleInterest) {
        this.lifeStyleInterest = lifeStyleInterest;
    }

    public int getWorldInterest() {
        return worldInterest;
    }

    public void setWorldInterest(int worldInterest) {
        this.worldInterest = worldInterest;
    }

    

    public void setWorldInterest(byte worldInterest) {
        this.worldInterest = worldInterest;
    }

    public int getTechnologyInterest() {
        return technologyInterest;
    }

    public void setTechnologyInterest(int technologyInterest) {
        this.technologyInterest = technologyInterest;
    }

    public long getTechnologyClicks() {
        return technologyClicks;
    }

    public void setTechnologyClicks(long technologyClicks) {
        this.technologyClicks = technologyClicks;
    }
    
    
    
   public UserInformation() {}
   
}