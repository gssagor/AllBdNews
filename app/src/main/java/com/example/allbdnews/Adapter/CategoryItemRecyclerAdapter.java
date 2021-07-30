package com.example.allbdnews.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.allbdnews.Models.CategoryItem;
import com.example.allbdnews.R;
import com.example.allbdnews.WebActivity;

import java.util.List;

public class CategoryItemRecyclerAdapter extends RecyclerView.Adapter<CategoryItemRecyclerAdapter.CategoryItemViewHolder> {

    private Context context;
    private List<CategoryItem>categoryItemList;



    public CategoryItemRecyclerAdapter(Context context, List<CategoryItem> categoryItemList) {
        this.context = context;
        this.categoryItemList = categoryItemList;
    }

    @NonNull

    @Override
    public CategoryItemRecyclerAdapter.CategoryItemViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.category_row_item,parent,false);
        return new CategoryItemViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryItemRecyclerAdapter.CategoryItemViewHolder holder, int position) {
        holder.itemImage.setImageResource(categoryItemList.get(position).getImageUrl());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nUrl= categoryItemList.get(position).getNewsLink();

                Intent intent= new Intent(context, WebActivity.class);
                intent.putExtra("newsUrl",nUrl);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return categoryItemList.size();
    }

    public class CategoryItemViewHolder  extends RecyclerView.ViewHolder{
        ImageView itemImage;


        public CategoryItemViewHolder(View itemView) {
            super(itemView);

            itemImage=itemView.findViewById(R.id.item_image);
        }
    }
}
