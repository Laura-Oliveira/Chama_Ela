package com.empodera.Controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.empodera.ListServiceActivity;
import com.empodera.R;

public class LoginActivity extends AppCompatActivity
{

    private EditText email, passaword;
    private String txt_email, txt_password;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = (EditText) findViewById(R.id.input_login_email_edit_text);
        passaword = (EditText) findViewById(R.id.input_login_password_edit_text);

        txt_email = email.getText().toString();
        txt_password = passaword.getText().toString();
    }

    public void openListServicePage(View view)
    {
//        if(txt_email == "laura" && txt_password == "1234")
//        {
            Intent activity = new Intent(LoginActivity.this, ListServiceActivity.class);
            Toast.makeText(this,"Login",Toast.LENGTH_LONG).show();
            startActivity(activity);
//        }

    }
}
