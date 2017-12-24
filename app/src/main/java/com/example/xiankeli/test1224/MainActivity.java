package com.example.xiankeli.test1224;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TabLayout mTabLayout;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mViewPager = findViewById(R.id.viewpager);
        initViewPager();
    }

    private void initViewPager() {
        mTabLayout = findViewById(R.id.tabs);

        List<String> titles = new ArrayList<>();
        titles.add("推荐");
        titles.add("热门");
        titles.add("本地");
        titles.add("科技");
        titles.add("财经");
        titles.add("互联网");
        titles.add("房产");
        titles.add("健康");
        titles.add("汽车");

        for (int i = 0; i < titles.size(); i++){
            mTabLayout.addTab(mTabLayout.newTab().setText(titles.get(i)));
        }

        
    }
}
