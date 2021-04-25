package com.empodera.Controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.empodera.R;

public class LoginActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void openRegisterUserPage(View view)
    {
        Intent activity = new Intent(LoginActivity.this, RegisterUserTypeActivity.class);
        startActivity(activity);
    }
}
