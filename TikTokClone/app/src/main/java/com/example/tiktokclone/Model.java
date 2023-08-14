package com.example.tiktokclone;

//Creating model for the recycler view
public class Model {

    String videoUrl; //We can give it name video path because we're not using server so we will not work with uri
    int profile; //If we use firebase then we've to use String here
    String name;

    //Creating this by right click -> generate -> constructor
    public Model(String videoUrl, int profile, String name) {
        this.videoUrl = videoUrl;
        this.profile = profile;
        this.name = name;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
