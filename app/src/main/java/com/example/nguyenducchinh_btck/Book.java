package com.example.nguyenducchinh_btck;

public class Book {
    String title, description;
    int img;
    public Book(String title, String description, int img) {
        this.title = title;
        this.description = description;
    }
    public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;}

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImg() {
        return img;
    }
    public void setImg(int img) {
        this.img = img;
    }
}
