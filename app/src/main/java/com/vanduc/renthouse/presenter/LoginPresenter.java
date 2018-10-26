package com.vanduc.renthouse.presenter;

import android.content.Context;

import com.vanduc.renthouse.callback.LoginCallback;

public class LoginPresenter {

    private Context context;

    private LoginCallback setListener;

    public void setSetListener(LoginCallback setListener) {
        this.setListener = setListener;
    }

    public LoginPresenter(Context context) {
        this.context = context;
    }

    public void facebookLogin() {
        setListener.loginCallback();
    }
}
