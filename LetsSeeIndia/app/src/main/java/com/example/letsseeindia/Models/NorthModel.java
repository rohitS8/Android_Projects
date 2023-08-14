package com.example.letsseeindia.Models;

public class NorthModel {

    int pic;
    int share;
    String name;

    public NorthModel(int pic, String name, int share) {
        this.pic = pic;
        this.name = name;
        this.share = share;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public int getShare() {
        return share;
    }

    public void setShare(int share) {
        this.share = share;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
