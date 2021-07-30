package com.example.allbdnews.Adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.allbdnews.Models.CategoryItem;
import com.example.allbdnews.R;

import java.util.List;

public class GridViewAdapter extends BaseAdapter {

    private Context mContext;
    private List<CategoryItem>categoryItemList;
    private LayoutInflater layoutInflater;

    public GridViewAdapter(Context mContext,List<CategoryItem>categoryItemList) {
        this.mContext = mContext;
        this.categoryItemList = categoryItemList;
        this.layoutInflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        Log.d("size of arrray", String.valueOf(categoryItemList));
        return categoryItemList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if ((view==null)){
            view= layoutInflater.inflate(R.layout.row_grid_item,viewGroup,false);

            ImageView imageView= view.findViewById(R.id.card_image_news);
            imageView.setImageResource(categoryItemList.get(i).getImageUrl());

        }
        return view;
    }
}
