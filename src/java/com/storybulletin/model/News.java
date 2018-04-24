/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.storybulletin.model;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table (name="news",uniqueConstraints = { @UniqueConstraint(columnNames = 
                                           { "NewsHeading", "NewsSourceName" })} )
public class News {
    @Id
    @GeneratedValue
    @Column(name="NewsID")
    private long newsID;
    
    @Column(name="NewsSourceName")
    private String newsSourceName;
    
    @Column(name="NewsType")
    private String newsType;
    
    @Column(name="NewsHeading")
    private String newsHeading;
    
    @Column(name="Link")
    private String link;
    
    @Column(name="FetchStatus")
    private int fetchStatus;

    @Column(name="Date")
    private String date;
    
    @Column(name="Views")
    private String views;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public News(){}

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public long getNewsID() {
        return newsID;
    }

    public void setNewsID(long newsID) {
        this.newsID = newsID;
    }

    public String getNewsSourceName() {
        return newsSourceName;
    }

    public void setNewsSourceName(String newsSourceName) {
        this.newsSourceName = newsSourceName;
    }

    public String getNewsType() {
        return newsType;
    }

    public void setNewsType(String newsType) {
        this.newsType = newsType;
    }

    public String getNewsHeading() {
        return newsHeading;
    }

    public void setNewsHeading(String newsHeading) {
        this.newsHeading = newsHeading;
    }

    public int getFetchStatus() {
        return fetchStatus;
    }

    public void setFetchStatus(int fetchStatus) {
        this.fetchStatus = fetchStatus;
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }

    
   
}
