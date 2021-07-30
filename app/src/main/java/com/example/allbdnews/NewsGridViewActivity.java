package com.example.allbdnews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.allbdnews.Adapter.GridViewAdapter;
import com.example.allbdnews.Models.CategoryItem;

import java.util.ArrayList;
import java.util.List;

public class NewsGridViewActivity extends AppCompatActivity {
    private GridView gridView;
    private List<CategoryItem>categoryItemList;
    /*public   List<CategoryItem>list=new ArrayList<>();
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_grid_view);

        gridView= findViewById(R.id.gridView_all_news);
        GridViewAdapter gridViewAdapter= new GridViewAdapter(this,categoryItemList);

       gridView.setAdapter(gridViewAdapter);
    }


}