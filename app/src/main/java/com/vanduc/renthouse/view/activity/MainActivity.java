package com.vanduc.renthouse.view.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.ImageButton;

import com.vanduc.renthouse.R;
import com.vanduc.renthouse.adapter.HouseAdapter;
import com.vanduc.renthouse.callback.MainCallback;
import com.vanduc.renthouse.model.House;
import com.vanduc.renthouse.presenter.MainPresenter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MainCallback {

    //Button
    private ImageButton ibSearch;
    private Toolbar toolbar;
    private RecyclerView recyclerView;
    private NavigationView navigationView;

    //SharedPreferences
    private SharedPreferences share;
    private SharedPreferences.Editor editor;

    //Intent
    protected Intent intent;

    //Presenter
    protected MainPresenter mainPresenter;

    //Adapter
    protected HouseAdapter adapter;
    private LinearLayoutManager llm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        viewSetup();

    }

    private void initView() {
        ibSearch = findViewById(R.id.ibSearch);
        toolbar = findViewById(R.id.toolbar);
        recyclerView = findViewById(R.id.recyclerView);
        navigationView = findViewById(R.id.navigationView);
    }

    private void viewSetup() {
        share = getSharedPreferences("user", MODE_PRIVATE);

        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_menu_black_24dp);

        mainPresenter = new MainPresenter(this);
        mainPresenter.setSetListener(this);
        mainPresenter.addList();

        llm = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(llm);

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

    @Override
    public void mainCallback(final ArrayList<House> ls) {
        adapter = new HouseAdapter(ls, getApplicationContext());
        recyclerView.setAdapter(adapter);
    }
}
