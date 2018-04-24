/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.storybulletin.model;
import java.util.Date;
import javax.persistence.*;
//import javax.xml.bind.annotation.XmlRootElement;
@Entity
@Table(name = "analytics")
//@XmlRootElement
public class Analytics {
    @Id 
   @GeneratedValue
   @Column(name = "AnalyticsID")
   private long analyticsID;

   @Column(name = "MorningClicks")
   private int morningCicks;

   @Column(name = "NightClicks")
   private int nightClicks;

   @Column(name = "NoonClicks")
   private int noonClicks;
   
   @Column(name = "MorningFemaleClicks")
   private int morningFemaleClicks;

   @Column(name = "NightFemaleClicks")
   private int nightFemaleClicks;

   @Column(name = "NoonFemaleClicks")
   private int noonFemaleClicks;
   
   @Column(name = "MorningMaleClicks")
   private int morningMaleClicks;

   @Column(name = "NightMaleClicks")
   private int nightMaleClicks;

   @Column(name = "NoonMaleClicks")
   private int noonMaleClicks;
   
   @Column(name = "Date")
   private String date;
    
   @Column(name = "SportsClicks")
   private int sportsClicks; 
 
   @Column(name = "PoliticsClicks")
   private int politicsClicks;
   
   @Column(name = "BusinessClicks")
   private int businessClicks;
   
   @Column(name = "LifeStyleClicks")
   private int lifeStyleClicks; 

   @Column(name = "TechnologyClicks")
   private int technologyClicks; 
   
   public Analytics(){}

    public long getAnalyticsID() {
        return analyticsID;
    }

    public void setAnalyticsID(long analyticsID) {
        this.analyticsID = analyticsID;
    }

    public int getMorningClicks() {
        return morningCicks;
    }

    public void setMorningClicks(int morningClicks) {
        this.morningCicks = morningCicks;
    }

    public int getNightClicks() {
        return nightClicks;
    }

    public void setNightClicks(int nightClicks) {
        this.nightClicks = nightClicks;
    }

    public int getNoonClicks() {
        return noonClicks;
    }

    public void setNoonClicks(int noonClicks) {
        this.noonClicks = noonClicks;
    }

    public int getMorningFemaleClicks() {
        return morningFemaleClicks;
    }

    public void setMorningFemaleClicks(int morningFemaleClicks) {
        this.morningFemaleClicks = morningFemaleClicks;
    }

    public int getNightFemaleClicks() {
        return nightFemaleClicks;
    }

    public void setNightFemaleClicks(int nightFemaleClicks) {
        this.nightFemaleClicks = nightFemaleClicks;
    }

    public int getNoonFemaleClicks() {
        return noonFemaleClicks;
    }

    public void setNoonFemaleClicks(int noonFemaleClicks) {
        this.noonFemaleClicks = noonFemaleClicks;
    }

    public int getMorningMaleClicks() {
        return morningMaleClicks;
    }

    public void setMorningMaleClicks(int morningMaleClicks) {
        this.morningMaleClicks = morningMaleClicks;
    }

    public int getNightMaleClicks() {
        return nightMaleClicks;
    }

    public void setNightMaleClicks(int nightMaleClicks) {
        this.nightMaleClicks = nightMaleClicks;
    }

    public int getNoonMaleClicks() {
        return noonMaleClicks;
    }

    public void setNoonMaleClicks(int noonMaleClicks) {
        this.noonMaleClicks = noonMaleClicks;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getSportsClicks() {
        return sportsClicks;
    }

    public void setSportsClicks(int sportsClicks) {
        this.sportsClicks = sportsClicks;
    }

    public int getPoliticsClicks() {
        return politicsClicks;
    }

    public void setPoliticsClicks(int politicsClicks) {
        this.politicsClicks = politicsClicks;
    }

    public int getBusinessClicks() {
        return businessClicks;
    }

    public void setBusinessClicks(int businessClicks) {
        this.businessClicks = businessClicks;
    }

    public int getLifeStyleClicks() {
        return lifeStyleClicks;
    }

    public void setLifeStyleClicks(int lifeStyleClicks) {
        this.lifeStyleClicks = lifeStyleClicks;
    }

    public int getTechnologyClicks() {
        return technologyClicks;
    }

    public void setTechnologyClicks(int technologyClicks) {
        this.technologyClicks = technologyClicks;
    }
    
    
    
}
