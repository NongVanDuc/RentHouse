package com.vanduc.renthouse.view.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.vanduc.renthouse.R;
import com.vanduc.renthouse.presenter.LoginPresenter;

public class LoginActivity extends AppCompatActivity implements FacebookCallback<LoginResult> {

    //Button
    private LoginButton btLogin;

    //SharedPreferences
    private SharedPreferences share;
    private SharedPreferences.Editor editor;

    //Intent
    protected Intent intent;

    //Presenter
    protected LoginPresenter loginPresenter;

    //FacebookLogin
    private CallbackManager callbackManager;

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
        callbackManager = CallbackManager.Factory.create();

        share = getSharedPreferences("user", MODE_PRIVATE);

        loginPresenter = new LoginPresenter(this);

        btLogin.registerCallback(callbackManager, this);
        btLogin.setReadPermissions("email");

        /*PackageInfo info;
        try {
            info = getPackageManager().getPackageInfo("com.vanduc.renthouse", PackageManager.GET_SIGNATURES);
            for (Signature signature : info.signatures) {
                MessageDigest md;
                md = MessageDigest.getInstance("SHA");
                md.update(signature.toByteArray());
                String something = new String(Base64.encode(md.digest(), 0));
                //String something = new String(Base64.encodeBytes(md.digest()));
                Log.e("hash key", something);
            }
        } catch (PackageManager.NameNotFoundException e1) {
            Log.e("name not found", e1.toString());
        } catch (NoSuchAlgorithmException e) {
            Log.e("no such an algorithm", e.toString());
        } catch (Exception e) {
            Log.e("exception", e.toString());
        }*/

    }

    @Override
    public void onSuccess(LoginResult loginResult) {
        editor = share.edit();
        editor.putBoolean("isLogin", true);
        editor.apply();
        intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onCancel() {

    }

    @Override
    public void onError(FacebookException error) {

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        callbackManager.onActivityResult(requestCode, resultCode, data);
    }
}
