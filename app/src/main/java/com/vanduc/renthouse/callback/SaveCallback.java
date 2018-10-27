package com.vanduc.renthouse.callback;

import com.vanduc.renthouse.model.House;

import java.util.ArrayList;

public interface SaveCallback {

    void saveCallback(ArrayList<House> ls);

    void rentCallback(ArrayList<House> ls);
}
