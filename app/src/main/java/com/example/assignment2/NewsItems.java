package com.example.assignment2;

public class NewsItems {

    String title;
    int img;
    String date;

    public NewsItems(String title, String date, int img) {
        this.date=date;
        this.title=title;
        this.img=img;
    }
    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
