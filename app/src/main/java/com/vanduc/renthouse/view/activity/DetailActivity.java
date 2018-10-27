package com.vanduc.renthouse.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.vanduc.renthouse.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {

    //Button
    private Toolbar toolbar;
    private CircleImageView ivAvatar;
    private TextView tvName;
    private TextView tvPhone;
    private ImageView ivImage1;
    private ImageView ivImage2;
    private ImageView ivImage3;
    private TextView tvAddress;
    private TextView tvPrice;
    private TextView tvDescription;
    private TextView tvOpportunities;
    private TextView tvBed;
    private TextView tvBath;
    private TextView tvFloor;
    private Button btMap;
    private Button btSave;
    private Button btRent;

    //Intent
    protected Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        initView();
        viewSetup();
    }

    private void initView() {
        toolbar = findViewById(R.id.toolbar);
        ivAvatar = findViewById(R.id.ivAvatar);
        tvName = findViewById(R.id.tvName);
        tvPhone = findViewById(R.id.tvPhone);
        ivImage1 = findViewById(R.id.ivImage1);
        ivImage2 = findViewById(R.id.ivImage2);
        ivImage3 = findViewById(R.id.ivImage3);
        tvAddress = findViewById(R.id.tvAddress);
        tvPrice = findViewById(R.id.tvPrice);
        tvDescription = findViewById(R.id.tvDescription);
        tvOpportunities = findViewById(R.id.tvOpportunities);
        tvBed = findViewById(R.id.tvBed);
        tvBath = findViewById(R.id.tvBath);
        tvFloor = findViewById(R.id.tvFloor);
        btMap = findViewById(R.id.btMap);
        btSave = findViewById(R.id.btSave);
        btRent = findViewById(R.id.btRent);
    }

    private void viewSetup() {
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);

        btSave.setOnClickListener(this);
        btRent.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btSave:
                intent = new Intent(this, SaveActivity.class);
                startActivity(intent);
                break;
            case R.id.btRent:
                intent = new Intent(this, SaveActivity.class);
                startActivity(intent);
                break;
        }
    }
}
