package com.vanduc.renthouse.presenter;

import android.content.Context;

import com.vanduc.renthouse.callback.SaveCallback;
import com.vanduc.renthouse.model.House;

import java.util.ArrayList;

public class SavePresenter {

    private ArrayList<House> lsSave, lsRent;
    private Context context;

    private SaveCallback setListener;

    public void setSetListener(SaveCallback setListener) {
        this.setListener = setListener;
    }

    public SavePresenter(Context context) {
        this.context = context;
        if (lsSave == null) {
            lsSave = new ArrayList<>();
        }
        if (lsRent == null) {
            lsRent = new ArrayList<>();
        }
    }

    public void getAllSave() {
        lsSave.add(new House("", "", "", "", "", ""));
        lsSave.add(new House("", "", "", "", "", ""));
        lsSave.add(new House("", "", "", "", "", ""));
        setListener.saveCallback(lsSave);
    }

    public void getAllRent() {
        lsRent.add(new House("", "", "", "", "", "", ""));
        lsRent.add(new House("", "", "", "", "", "", ""));
        lsRent.add(new House("", "", "", "", "", "", ""));
        lsRent.add(new House("", "", "", "", "", "", ""));
        setListener.rentCallback(lsRent);
    }
}
