package com.empodera.Controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.empodera.Model.UserApp;
import com.empodera.R;
import com.empodera.View.SearchWorkerActivity;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterUserActivity extends AppCompatActivity
{
    View view;

    /* Get firebase database instance */
    private FirebaseDatabase database = FirebaseDatabase.getInstance();

   // private RadioGroup user, worker;
    private EditText name, email, phone, password;

    private String txt_name, txt_email, txt_password, txt_phone;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);

        name = (EditText) findViewById(R.id.register_username_edit_text);
        email = (EditText) findViewById(R.id.register_email_edit_text);
        password = (EditText) findViewById(R.id.register_password_edit_text);
        phone = (EditText) findViewById(R.id.register_phone_edit_text);
    }

    public void registerUser(View view)
    {
        String typeUser = "";
        UserApp userApp = new UserApp();
        DatabaseReference databaseReferenceInstance = database.getReference();
        DatabaseReference databaseReference = databaseReferenceInstance.child("user");

        /* Converting EditText type into String type */
        txt_name = name.getText().toString();
        txt_email = email.getText().toString();
        txt_password = password.getText().toString();
        txt_phone = phone.getText().toString();

        /* Select the database instance child user */
        databaseReference = database.getReference("user");

        /* Setting data into ServiceApp class */
        userApp.setName(txt_name);
        userApp.setEmail(txt_email);
        userApp.setPhone(txt_phone);
        userApp.setPassword(txt_password);

        /* Transfering data into Firebase object reference */
        userApp.setId(databaseReference.push().getKey());

        /* Data ransfered from object to Firebase database */
        databaseReference.child(userApp.getId()).setValue(userApp);

        Intent activity = new Intent(RegisterUserActivity.this, LoginActivity.class);
        startActivity(activity);
        Toast.makeText(this,"Usuário(a) Cadastrado com Sucesso!",Toast.LENGTH_LONG).show();
    }
}
