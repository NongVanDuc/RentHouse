package com.vanduc.renthouse.view.activity;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.vanduc.renthouse.R;
import com.vanduc.renthouse.adapter.RentAdapter;
import com.vanduc.renthouse.adapter.SaveAdapter;
import com.vanduc.renthouse.callback.SaveCallback;
import com.vanduc.renthouse.model.House;
import com.vanduc.renthouse.presenter.SavePresenter;

import java.util.ArrayList;

public class SaveActivity extends AppCompatActivity implements SaveCallback {

    //Button
    private Toolbar toolbar;
    private RecyclerView recyclerViewSave;
    private Toolbar toolbarRent;
    private RecyclerView recyclerViewRent;

    //Adapter
    private SaveAdapter saveAdapter;
    private RentAdapter rentAdapter;

    //LayoutManager
    private LinearLayoutManager llm;
    private GridLayoutManager glm;

    //Presenter
    protected SavePresenter savePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save);

        initView();
        viewSetup();
    }

    private void initView() {
        toolbar = findViewById(R.id.toolbar);
        recyclerViewSave = findViewById(R.id.recyclerViewSave);
        toolbarRent = findViewById(R.id.toolbarRent);
        recyclerViewRent = findViewById(R.id.recyclerViewRent);
    }

    private void viewSetup() {
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);

        savePresenter = new SavePresenter(this);
        savePresenter.setSetListener(this);
        savePresenter.getAllSave();
        savePresenter.getAllRent();

        llm = new LinearLayoutManager(this);
        glm = new GridLayoutManager(this, 2);
        recyclerViewSave.setLayoutManager(llm);
        recyclerViewRent.setLayoutManager(glm);

    }

    @Override
    public void saveCallback(ArrayList<House> ls) {
        saveAdapter = new SaveAdapter(ls, this);
        recyclerViewSave.setAdapter(saveAdapter);
    }

    @Override
    public void rentCallback(ArrayList<House> ls) {
        rentAdapter = new RentAdapter(ls, this);
        recyclerViewRent.setAdapter(rentAdapter);
    }
}
