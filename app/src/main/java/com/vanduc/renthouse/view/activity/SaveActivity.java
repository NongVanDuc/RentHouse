package com.vanduc.renthouse.view.activity;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.vanduc.renthouse.R;

public class SaveActivity extends AppCompatActivity {

    //Button
    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save);


        initView();
        viewSetup();
    }

    private void initView() {
        toolbar = findViewById(R.id.toolbar);
    }

    private void viewSetup() {
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
    }
}
