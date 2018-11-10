package com.vanduc.renthouse.view.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.vanduc.renthouse.R;

public class OptionActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {
    private LinearLayout lrLogo;
    private ImageView imgLogo;
    private TextView tvLogo;
    private LinearLayout lrInput;
    private EditText etDistrict;
    private EditText etWard;
    private Button btnChoThue;
    private Button btnDiThue;
    private Spinner spinerState;
    private Spinner spinerState1;

    private static final String[] paths = {"Chọn Quận", "item 1","item 2", "item 3"};
    private static final String[] paths2 = {"Chọn Phường", "item 1","item 2", "item 3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);
        initView();
    }

    private void initView() {

        lrLogo = (LinearLayout) findViewById(R.id.lr_logo);
        imgLogo = (ImageView) findViewById(R.id.img_logo);
        tvLogo = (TextView) findViewById(R.id.tv_logo);
        lrInput = (LinearLayout) findViewById(R.id.lr_input);
        btnChoThue = (Button) findViewById(R.id.btChoThue);
        btnDiThue = (Button) findViewById(R.id.btDiThue);
        btnDiThue .setOnClickListener(this);
        btnChoThue .setOnClickListener(this);
        spinerState = (Spinner) findViewById(R.id.spiner_state);
        spinerState1 = (Spinner) findViewById(R.id.spiner_state1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(OptionActivity.this,
                android.R.layout.simple_spinner_item,paths);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinerState.setAdapter(adapter);
        spinerState.setOnItemSelectedListener(this);

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OptionActivity.this,
                android.R.layout.simple_spinner_item,paths2);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinerState1.setAdapter(adapter2);
        spinerState1.setOnItemSelectedListener(this);
    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:
                // Whatever you want to happen when the first item gets selected
                break;
            case 1:
                // Whatever you want to happen when the second item gets selected
                break;
            case 2:
                // Whatever you want to happen when the thrid item gets selected
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btDiThue:
                Intent intent = new Intent(this, DrawerActivity.class);
                startActivity(intent);
                break;
            case R.id.btChoThue:
                Intent intent2 = new Intent(this, ActivitySaleHouse.class);
                startActivity(intent2);
                break;
        }
    }
}
