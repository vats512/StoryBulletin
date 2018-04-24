/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.storybulletin.model;
import javax.persistence.*;

@Entity
@Table (name="newsdetail")
public class NewsDetail {
    @Id
    @GeneratedValue
    @Column(name="NewsDetailID")
    private long newsDetailID;
    
    @Column(name="NewsID")
    private long newsID;
    
    @Column(name="DetailNews")
    private String detailNews;
    
    @Column(name="ImageLink")
    private String imageLink;
    
   public NewsDetail(){}

    public long getNewsDetailID() {
        return newsDetailID;
    }

    public void setNewsDetailID(long newsDetailID) {
        this.newsDetailID = newsDetailID;
    }

    public long getNewsID() {
        return newsID;
    }

    public void setNewsID(long newsID) {
        this.newsID = newsID;
    }

    public String getDetailNews() {
        return detailNews;
    }

    public void setDetailNews(String detailNews) {
        this.detailNews = detailNews;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }
   
   
   
}
