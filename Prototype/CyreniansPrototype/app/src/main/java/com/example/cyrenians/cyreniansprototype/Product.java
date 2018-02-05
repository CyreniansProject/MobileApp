package com.example.cyrenians.cyreniansprototype;

/**
 * Created by Alex on 2/4/2018.
 */

public class Product {
    String title,desc;
    int image;

    public String getProduct(){
        return title;
    }
    public void setName(String title){
        this.title = title;
    }
    public String getDesc(){
        return desc;
    }
    public void setDesc(String desc){
        this.desc = desc;
    }
    public int getImage(){
        return image;
    }
    public void setImage(int image){
        this.image=image;
    }
}
