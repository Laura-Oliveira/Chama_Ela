package com.empodera.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.empodera.R;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ProfileActivity extends AppCompatActivity
{
    private DatabaseReference firebaseDatabase = FirebaseDatabase.getInstance().getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        TextView usernameText = findViewById(R.id.profile_user_name);
//        TextView userEmailText = findViewById(R.id.profile_user_email);
//        TextView serviceNameText = findViewById(R.id.profile_service_name);
//        TextView priceServiceText = findViewById(R.id.profile_service_price);
//        TextView priceTicketText = findViewById(R.id.profile_price_ticket);

//        String userEmail = intent.getStringExtra("email");
//        String serviceName = intent.getStringExtra("serviceName");
//        String priceService = String.valueOf((intent.putExtra("priceService", priceServiceText.getText().toString())));
//        String priceTicket = String.valueOf(intent.putExtra("priceTicket", priceTicketText.getText().toString()));



        String firebaseResult = String.valueOf(firebaseDatabase.child("user").child("name").get().addOnCompleteListener(task -> {
            if (task.isSuccessful()) {
                if (task.getResult().exists()) {
                    //DataSnapshot dataSnapshot = task.getValue<String>();
                    DataSnapshot dataSnapshot = task.getResult();
                    String username = dataSnapshot.child("user").child("name").getValue(String.class);
                    usernameText.setText(username);
                    Log.d("usernameText Value", String.valueOf(usernameText));
                   // Log.d("firebase child value", task.getResult().getValue(String.class));
                    Toast.makeText(ProfileActivity.this, task.getResult().getKey(), Toast.LENGTH_LONG).show();
                }
            } else {
                Toast.makeText(ProfileActivity.this, "Error retriving data", Toast.LENGTH_SHORT).show();
                Log.e("firebase error", "Error getting data", task.getException());
            }
        }));
       usernameText.setText(firebaseResult);/**/
       Toast.makeText(ProfileActivity.this, firebaseResult, Toast.LENGTH_LONG).show();

//        userEmailText.setText(userEmail);
//        serviceNameText.setText(serviceName);
//        priceServiceText.setText(priceService);
//        priceTicketText.setText(priceTicket);

   }
}


