/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.storybulletin.model;

/**
 *
 * @author Honey Shah
 */
public class FetchNews {
    private long newsID;
    private String newsSourceName;
    private String newsType;
    private String newsHeading;
    private String link;
    private int fetchStatus;
    private String date;
    private long newsDetailID;
    private String detailNews;
    private String imageLink="";

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

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getFetchStatus() {
        return fetchStatus;
    }

    public void setFetchStatus(int fetchStatus) {
        this.fetchStatus = fetchStatus;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public long getNewsDetailID() {
        return newsDetailID;
    }

    public void setNewsDetailID(long newsDetailID) {
        this.newsDetailID = newsDetailID;
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

    public FetchNews(long newsID, String newsSourceName, String newsType, String newsHeading, String link, int fetchStatus, String date, long newsDetailID, String detailNews,String imageLink) {
        this.newsID = newsID;
        this.newsSourceName = newsSourceName;
        this.newsType = newsType;
        this.newsHeading = newsHeading;
        this.link = link;
        this.fetchStatus = fetchStatus;
        this.date = date;
        this.newsDetailID = newsDetailID;
        this.detailNews = detailNews;
        this.imageLink=imageLink;
    }
    
    
}
