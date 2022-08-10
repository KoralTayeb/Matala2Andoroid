package com.journaldev.recyclerviewcardview;


public class DataModel {

    String name;
    String Desc;
    int id_;
    int image;

    public DataModel(String name, String Desc, int id_, int image) {
        this.name = name;
        this.Desc = Desc;
        this.id_ = id_;
        this.image=image;
    }


    public String getName() {
        return name;
    }


    public String getDesc() {
        return Desc;
    }

    public int getImage() {
        return image;
    }

    public int getId() {
        return id_;
    }
}