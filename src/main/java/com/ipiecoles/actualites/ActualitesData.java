package com.ipiecoles.actualites;

import java.time.LocalDate;

public class ActualitesData {
    String link;
    String title;
    String description;
    LocalDate pubDate;

    public ActualitesData(){

    }

    public ActualitesData(String link, String title, String description, LocalDate pubDate) {
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

    public LocalDate getPubDate() {
        return pubDate;
    }

    public void setPubDate(LocalDate pubDate) {
        this.pubDate = pubDate;
    }

    //else
}
