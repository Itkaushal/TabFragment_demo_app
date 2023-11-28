package com.example.tabfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.tabfragment.databinding.ActivityMainBinding;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());
        mainBinding.tabLayout.addTab(mainBinding.tabLayout.newTab().setText("First Tab"),0,true);
        mainBinding.tabLayout.addTab(mainBinding.tabLayout.newTab().setText("Second Tab"),1,false);

        TabAdapter tabAdapter=new TabAdapter(MainActivity.this);
        mainBinding.pager.setAdapter(tabAdapter);
        mainBinding.tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mainBinding.pager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}