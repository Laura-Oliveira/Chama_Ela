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

    private RadioGroup user, worker;
    private EditText name, surname, email, phone, password;

    private String txt_type_user, txt_worker, txt_name, txt_surname, txt_email, txt_password, txt_phone;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);

        name = findViewById(R.id.register_username_edit_text);
        surname = findViewById(R.id.register_surname_edit_text);
        email = findViewById(R.id.register_email_edit_text);
        password = findViewById(R.id.register_password_edit_text);
        phone = findViewById(R.id.register_phone_edit_text);
    }

    public void registerUser(View view)
    {
        String typeUser = "";
        UserApp userApp = new UserApp();
        DatabaseReference databaseReferenceInstance = database.getReference();
        DatabaseReference databaseReference = databaseReferenceInstance.child("user");

        /* VALIDATE IF RADIO BUTTON IS CHECKED
        if(typeUser)
        {
        }
        */

        /* Converting EditText type into String type */
        txt_name = name.getText().toString();
        txt_surname = surname.getText().toString();
        txt_email = email.getText().toString();
        txt_password = password.getText().toString();
        txt_phone = phone.getText().toString();

        /* Select the database instance child user */
        databaseReference = database.getReference("user");

        /* Setting data into ServiceApp class */
        userApp.setName(txt_name);
        userApp.setSurname(txt_surname);
        userApp.setEmail(txt_email);
        userApp.setPhone(txt_phone);
        userApp.setPassword(txt_password);

        /* Transfering data into Firebase object reference */
        userApp.setId(databaseReference.push().getKey());

        /* Data ransfered from object to Firebase database */
        databaseReference.child(userApp.getId()).setValue(userApp);

        Intent activity = new Intent(RegisterUserActivity.this, SearchWorkerActivity.class);
        startActivity(activity);
        Toast.makeText(this,"Usuário Cadastrado com Sucesso",Toast.LENGTH_LONG).show();

    }
}
