package com.example.allbdnews.Adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.allbdnews.Models.CategoryItem;
import com.example.allbdnews.Models.CategoryModel;
import com.example.allbdnews.NewsGridViewActivity;
import com.example.allbdnews.R;

import java.util.ArrayList;
import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder> {

    private Context context;
    private List<CategoryModel>categoryModelList;

    public CategoryAdapter(Context context, List<CategoryModel> categoryModelList) {
        this.context = context;
        this.categoryModelList = categoryModelList;
    }

    @NonNull

    @Override
    public CategoryAdapter.CategoryViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.main_recycler_row_layout,parent,false);
        return new CategoryViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull  CategoryAdapter.CategoryViewHolder holder, int position) {

        holder.categoryTitle.setText(categoryModelList.get(position).getCategoryTitle());
        setCatItemRecycler(holder.itemRecycler,categoryModelList.get(position).getCategoryItemList());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(context, NewsGridViewActivity.class);
                context.startActivity(intent);

            }
        });


    }

    @Override
    public int getItemCount() {
        return categoryModelList.size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder{
        private TextView categoryTitle;
        RecyclerView itemRecycler;

        public CategoryViewHolder(View itemView) {
            super(itemView);

            categoryTitle=itemView.findViewById(R.id.cate_title);
            itemRecycler=itemView.findViewById(R.id.item_recycler);
        }
    }

    private void setCatItemRecycler(RecyclerView recyclerView, List<CategoryItem>categoryItemList){
        CategoryItemRecyclerAdapter itemRecyclerAdapter= new CategoryItemRecyclerAdapter(context,categoryItemList);
        recyclerView.setLayoutManager(new LinearLayoutManager(context,RecyclerView.HORIZONTAL,false));
        recyclerView.setAdapter(itemRecyclerAdapter);
    }
}
