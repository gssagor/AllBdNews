package com.example.allbdnews.Models;

import java.util.List;

public class CategoryModel {
    String categoryTitle;
    List<CategoryItem>categoryItemList;

    public List<CategoryItem> getCategoryItemList() {
        return categoryItemList;
    }

    public void setCategoryItemList(List<CategoryItem> categoryItemList) {
        this.categoryItemList = categoryItemList;
    }



    public CategoryModel(String categoryTitle, List<CategoryItem>categoryItemList) {
        this.categoryTitle = categoryTitle;
        this. categoryItemList=categoryItemList;
    }


    public String getCategoryTitle() {
        return categoryTitle;
    }

    public void setCategoryTitle(String categoryTitle) {
        this.categoryTitle = categoryTitle;
    }
}
