package com.vanduc.renthouse.view.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.vanduc.renthouse.R;
import com.vanduc.renthouse.callback.LoginCallback;
import com.vanduc.renthouse.presenter.LoginPresenter;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener, LoginCallback {

    //Button
    private Button btLogin;

    //SharedPreferences
    private SharedPreferences share;
    private SharedPreferences.Editor editor;

    //Intent
    protected Intent intent;

    //Presenter
    protected LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();
        viewSetup();
    }

    private void initView() {
        btLogin = findViewById(R.id.btLogin);
    }

    private void viewSetup() {
        share = getSharedPreferences("user", MODE_PRIVATE);

        loginPresenter = new LoginPresenter(this);
        loginPresenter.setSetListener(this);

        btLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btLogin:
                loginPresenter.facebookLogin();
                break;
        }
    }

    @Override
    public void loginCallback() {
        editor = share.edit();
        editor.putBoolean("isLogin", true);
        editor.apply();

        intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
