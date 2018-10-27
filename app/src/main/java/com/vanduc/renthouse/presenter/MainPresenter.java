package com.vanduc.renthouse.presenter;

import android.content.Context;

import com.vanduc.renthouse.callback.MainCallback;
import com.vanduc.renthouse.model.House;

import java.util.ArrayList;

public class MainPresenter {

    private Context context;
    private ArrayList<House> ls;

    private MainCallback setListener;

    public void setSetListener(MainCallback setListener) {
        this.setListener = setListener;
    }

    public MainPresenter(Context context) {
        this.context = context;
        if (ls == null) {
            ls = new ArrayList<>();
        }
    }

    public void addList() {
        ls.add(new House("", "", "", "", "", "", "", "", "", "", "", "", ""));
        ls.add(new House("", "", "", "", "", "", "", "", "", "", "", "", ""));
        ls.add(new House("", "", "", "", "", "", "", "", "", "", "", "", ""));
        ls.add(new House("", "", "", "", "", "", "", "", "", "", "", "", ""));
        ls.add(new House("", "", "", "", "", "", "", "", "", "", "", "", ""));
        setListener.mainCallback(ls);
    }
}
