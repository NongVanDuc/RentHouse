package com.vanduc.renthouse.view.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.vanduc.renthouse.R;

public class ActivitySaleHouse extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener {
    private Toolbar toolbar;
    private TextView tvPost;
    private EditText edtAddressHouse;
    private Spinner spinerState;
    private Spinner spinerState1;
    private EditText edtPhoneNumber;
    private EditText edtPrice;
    private EditText edtContent;
    private EditText edtNumberRoom;
    private EditText edtNumberBathroom;
    private EditText edtNumberFlooor;
    private ImageView imgPickerImage;
    private Button btnUploadImage;
    private Button btnUpPots;
    private static final String[] paths = {"Chọn Quận", "item 1","item 2", "item 3"};
    private static final String[] paths2 = {"Chọn Phường", "item 1","item 2", "item 3"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sale_hose);
        initView();
    }

    private void initView() {

        imgPickerImage = (ImageView) findViewById(R.id.img_picker_image);
        btnUploadImage = (Button) findViewById(R.id.btn_upload_image);
        btnUpPots = (Button) findViewById(R.id.btn_up_pots);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tvPost = (TextView) findViewById(R.id.tv_post);
        edtAddressHouse = (EditText) findViewById(R.id.edt_address_house);
        spinerState = (Spinner) findViewById(R.id.spiner_state);
        spinerState1 = (Spinner) findViewById(R.id.spiner_state_1);
        edtPhoneNumber = (EditText) findViewById(R.id.edt_phone_number);
        edtPrice = (EditText) findViewById(R.id.edt_price);
        edtContent = (EditText) findViewById(R.id.edt_content);
        edtNumberRoom = (EditText) findViewById(R.id.edt_number_room);
        edtNumberBathroom = (EditText) findViewById(R.id.edt_number_bathroom);
        edtNumberFlooor = (EditText) findViewById(R.id.edt_number_flooor);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(ActivitySaleHouse.this,
                android.R.layout.simple_spinner_item,paths);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinerState.setAdapter(adapter);
        spinerState.setOnItemSelectedListener(this);

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(ActivitySaleHouse.this,
                android.R.layout.simple_spinner_item,paths2);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinerState1.setAdapter(adapter2);
        spinerState1.setOnItemSelectedListener(this);
        btnUpPots.setOnClickListener(this);
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
            case R.id.btn_up_pots:
                Intent intent = new Intent(this,ActivityCustomer.class);
                startActivity(intent);
                break;
        }
    }
}
