package com.ipiecoles.actualites;

import java.time.LocalDate;

public class ActualitesData {
    String link;
    String title;
    String description;
    String pubDate;

    public ActualitesData(){

    }

    public ActualitesData(String link, String title, String description, String pubDate) {
        this.link = link;
        this.title = title;
        this.description = description;
        this.pubDate = pubDate;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    //else
}
