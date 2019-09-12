package com.vit.mathathon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.material.bottomappbar.BottomAppBar;

public class MainActivity extends AppCompatActivity {

    private BottomAppBar bottomAppBar;
    private Toolbar toolbar;

    private Button day1;
    private Button day2;
    private Button day3;

    private LinearLayout day1_layout;
    private LinearLayout day2_layout;
    private LinearLayout day3_layout;

    private LinearLayout first;
    private LinearLayout second;
    private LinearLayout third;
    private LinearLayout fourth;
    private LinearLayout first_1;
    private LinearLayout first_2;
    private LinearLayout second_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //getSupportActionBar().hide();
        toolbar = (Toolbar) findViewById(R.id.bottom_app_bar);
        setSupportActionBar(toolbar);

        day1 = findViewById(R.id.day1);
        day2 = findViewById(R.id.day2);
        day3 = findViewById(R.id.day3);

        day2.getBackground().setAlpha(64);
        day3.getBackground().setAlpha(64);
        day2.setTextColor(day2.getTextColors().withAlpha(64));
        day3.setTextColor(day3.getTextColors().withAlpha(64));

        day1_layout = findViewById(R.id.day1_layout);
        day2_layout = findViewById(R.id.day2_layout);
        day3_layout = findViewById(R.id.day3_layout);

        first = findViewById(R.id.first);
        second = findViewById(R.id.second);
        third = findViewById(R.id.third);
        fourth = findViewById(R.id.fourth);
        first_1 = findViewById(R.id.first_1);
        first_2 = findViewById(R.id.first_2);
        second_1 = findViewById(R.id.second_1);

        day1_layout.setVisibility(View.VISIBLE);
        day2_layout.setVisibility(View.GONE);
        day3_layout.setVisibility(View.GONE);

        day1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                day1.getBackground().setAlpha(255);
                day1.setTextColor(day1.getTextColors().withAlpha(255));
                day2.getBackground().setAlpha(64);
                day3.getBackground().setAlpha(64);
                day2.setTextColor(day2.getTextColors().withAlpha(64));
                day3.setTextColor(day3.getTextColors().withAlpha(64));
                day1_layout.setVisibility(View.VISIBLE);
                day2_layout.setVisibility(View.GONE);
                day3_layout.setVisibility(View.GONE);
            }
        });

        day2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                day2.getBackground().setAlpha(255);
                day2.setTextColor(day2.getTextColors().withAlpha(255));
                day1.getBackground().setAlpha(64);
                day3.getBackground().setAlpha(64);
                day1.setTextColor(day1.getTextColors().withAlpha(64));
                day3.setTextColor(day3.getTextColors().withAlpha(64));
                day1_layout.setVisibility(View.GONE);
                day2_layout.setVisibility(View.VISIBLE);
                day3_layout.setVisibility(View.GONE);
            }
        });

        day3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                day3.getBackground().setAlpha(255);
                day3.setTextColor(day3.getTextColors().withAlpha(255));
                day2.getBackground().setAlpha(64);
                day1.getBackground().setAlpha(64);
                day2.setTextColor(day2.getTextColors().withAlpha(64));
                day1.setTextColor(day1.getTextColors().withAlpha(64));
                day1_layout.setVisibility(View.GONE);
                day2_layout.setVisibility(View.GONE);
                day3_layout.setVisibility(View.VISIBLE);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.bottomappbar_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home: {
                BottomNavigationDrawerFragment bottomNavDrawerFragment = new BottomNavigationDrawerFragment();
                bottomNavDrawerFragment.show(getSupportFragmentManager(), "TAG");
            }
        }
        return true;
    }

}
