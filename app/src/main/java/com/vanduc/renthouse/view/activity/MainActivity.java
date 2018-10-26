package com.vanduc.renthouse.view.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.vanduc.renthouse.R;

public class MainActivity extends AppCompatActivity {

    //Button
    private Toolbar toolbar;


    //SharedPreferences
    private SharedPreferences share;
    private SharedPreferences.Editor editor;

    //Intent
    protected Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        viewSetup();

    }

    private void initView() {
        toolbar = findViewById(R.id.toolbar);
    }

    private void viewSetup() {
        share = getSharedPreferences("user", MODE_PRIVATE);

        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_menu);

    }

    @Override
    protected void onStart() {
        super.onStart();
        boolean isLogin = share.getBoolean("isLogin", false);
        if (!isLogin) {
            intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
            finish();
        }
    }
}
