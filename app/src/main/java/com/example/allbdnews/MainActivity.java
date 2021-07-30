package com.example.allbdnews;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.allbdnews.Adapter.CategoryAdapter;
import com.example.allbdnews.Models.CategoryItem;
import com.example.allbdnews.Models.CategoryModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mainCategoryRecycler;
    CategoryAdapter categoryAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<CategoryItem>categoryItemList=new ArrayList<>();
        categoryItemList.add(new CategoryItem(1,R.drawable.prothomalo,"https://www.prothomalo.com/"));
        categoryItemList.add(new CategoryItem(2,R.drawable.jugantor,"https://www.jugantor.com/all-news/todays-paper"));
        categoryItemList.add(new CategoryItem(3,R.drawable.kalerkontho,"https://www.kalerkantho.com/"));
        categoryItemList.add(new CategoryItem(4,R.drawable.samakal,"https://samakal.com/"));
        categoryItemList.add(new CategoryItem(5,R.drawable.manabkantha,"https://www.manobkantha.com.bd/"));
        categoryItemList.add(new CategoryItem(6,R.drawable.noyadigonto,"https://dailynayadiganta.com/"));
        categoryItemList.add(new CategoryItem(7,R.drawable.ittefaq,"https://www.ittefaq.com.bd/"));
        categoryItemList.add(new CategoryItem(8,R.drawable.inqilab,"https://www.dailyinqilab.com/"));
        categoryItemList.add(new CategoryItem(9,R.drawable.manobjomin,"https://mzamin.com/"));
        categoryItemList.add(new CategoryItem(10,R.drawable.amadershomoy,"https://www.dainikamadershomoy.com/"));
        categoryItemList.add(new CategoryItem(11,R.drawable.amarshongbad,"https://www.amarsangbad.com/"));
        categoryItemList.add(new CategoryItem(12,R.drawable.bangladeshprotidin,"https://www.bd-pratidin.com/"));
        categoryItemList.add(new CategoryItem(13,R.drawable.doinikshonggram,"https://dailysangram.com/"));
        categoryItemList.add(new CategoryItem(14,R.drawable.orthonitir_kagoj,"https://www.arthoniteerkagoj.com/"));
        categoryItemList.add(new CategoryItem(15,R.drawable.protidinershongbad,"https://protidinersangbad.com/"));
        categoryItemList.add(new CategoryItem(16,R.drawable.vorer_kagoj,"https://www.bhorerkagoj.com/"));

        List<CategoryItem>categoryItemList2=new ArrayList<>();
        categoryItemList2.add(new CategoryItem(1,R.drawable.theindependent,"https://m.theindependentbd.com/"));
        categoryItemList2.add(new CategoryItem(2,R.drawable.dailystar,"https://www.thedailystar.net/"));
        categoryItemList2.add(new CategoryItem(3,R.drawable.newage,"https://www.newagebd.net/"));
        categoryItemList2.add(new CategoryItem(4,R.drawable.bangladeshtoday,"https://thebangladeshtoday.com/"));

        List<CategoryItem>categoryItemList3=new ArrayList<>();
        categoryItemList3.add(new CategoryItem(1,R.drawable.jagonews24,"https://www.jagonews24.com/"));
        categoryItemList3.add(new CategoryItem(2,R.drawable.banglatribiun,"https://www.banglatribune.com/"));
        categoryItemList3.add(new CategoryItem(3,R.drawable.news24,"https://www.news24bd.tv/"));
        categoryItemList3.add(new CategoryItem(4,R.drawable.bdnews24,"https://bdnews24.com/"));

      List<CategoryModel> allCategoryList= new ArrayList<>();

      allCategoryList.add(new CategoryModel("Bangla Newspapers",categoryItemList));
      allCategoryList.add(new CategoryModel("English Newspapers",categoryItemList2));
      allCategoryList.add(new CategoryModel("Online newspapers",categoryItemList3));

      setMainCategoryRecycler(allCategoryList);

    }

    private void setMainCategoryRecycler(List<CategoryModel>allCategoryList){

        mainCategoryRecycler= findViewById(R.id.news_category_recycler);
        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(this);
        mainCategoryRecycler.setLayoutManager(layoutManager);
        categoryAdapter=new CategoryAdapter(this,allCategoryList);
        mainCategoryRecycler.setAdapter(categoryAdapter);
    }
}