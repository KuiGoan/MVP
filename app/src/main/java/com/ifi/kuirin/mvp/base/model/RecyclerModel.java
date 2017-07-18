package com.ifi.kuirin.mvp.base.model;

/**
 * Created by KuiRin on 7/17/2017 AD.
 */

public class RecyclerModel {
    private String mTitle;
    private int mImageResourceId;

    public RecyclerModel(String title) {
        this.mTitle = title;
    }

    public RecyclerModel(String title, int imageResourceId) {
        this.mTitle = title;
        this.mImageResourceId = imageResourceId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.mImageResourceId = imageResourceId;
    }
}
