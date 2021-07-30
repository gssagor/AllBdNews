package com.example.allbdnews.Models;

import android.os.Parcel;
import android.os.Parcelable;

public class CategoryItem {

    Integer itemId;
    Integer imageUrl;
    String newsLink;



    public CategoryItem(Integer itemId, Integer imageUrl,String newsLink) {
        this.itemId = itemId;
        this.imageUrl = imageUrl;
        this.newsLink=newsLink;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getNewsLink() {
        return newsLink;
    }

    public void setNewsLink(String newsLink) {
        this.newsLink = newsLink;
    }
}
