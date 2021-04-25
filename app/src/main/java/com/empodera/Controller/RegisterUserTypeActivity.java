package com.empodera.Controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.empodera.R;

public class RegisterUserTypeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user_type);
    }

    public void openRegisterUser(View view)
    {
        Intent activity = new Intent(RegisterUserTypeActivity.this, RegisterUserActivity.class);
        startActivity(activity);
    }
}