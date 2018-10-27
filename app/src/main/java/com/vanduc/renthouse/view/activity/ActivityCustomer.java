package com.vanduc.renthouse.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.vanduc.renthouse.R;
import com.vanduc.renthouse.adapter.CustomerAdapter;
import com.vanduc.renthouse.model.Customer;

import java.util.ArrayList;

public class ActivityCustomer extends AppCompatActivity {
    private Toolbar toolbar;
    private RecyclerView rcvCustomer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);
        initView();
        addList();
    }

    private void addList() {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("","","","",""));
        customers.add(new Customer("","","","",""));
        customers.add(new Customer("","","","",""));
        customers.add(new Customer("","","","",""));
        customers.add(new Customer("","","","",""));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rcvCustomer.setLayoutManager(linearLayoutManager);
        CustomerAdapter customerAdapter = new CustomerAdapter(customers,this);
        rcvCustomer.setAdapter(customerAdapter);
        customerAdapter.notifyDataSetChanged();
    }

    private void initView() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        rcvCustomer = (RecyclerView) findViewById(R.id.rcv_customer);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
}
