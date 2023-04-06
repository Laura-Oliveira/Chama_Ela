package com.empodera.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.empodera.R;
import com.google.android.gms.tasks.OnCompleteListener;
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

        Intent intent = getIntent();
        TextView usernameText = findViewById(R.id.profile_user_name);
//        TextView userEmailText = findViewById(R.id.profile_user_email);
//        TextView serviceNameText = findViewById(R.id.profile_service_name);
//        TextView priceServiceText = findViewById(R.id.profile_service_price);
//        TextView priceTicketText = findViewById(R.id.profile_price_ticket);

       // String username = intent.getStringExtra("name");
//        String userEmail = intent.getStringExtra("email");
//        String serviceName = intent.getStringExtra("serviceName");
//        String priceService = String.valueOf((intent.putExtra("priceService", priceServiceText.getText().toString())));
//        String priceTicket = String.valueOf(intent.putExtra("priceTicket", priceTicketText.getText().toString()));

        //firebaseDatabase.child("user").child(username).child("name");
        String firebaseResult = String.valueOf(firebaseDatabase.child("user").get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DataSnapshot> task)
            {
                if (task.isSuccessful())
                {
//                    for (DataSnapshot resultList : task.getResult().getChildren()) {
//                        String username = resultList.child("user").getValue(String.class);
//                       // testInputTxt.setText(passwordUser+"tatata");
//                        usernameText.setText(username);
//                        Toast.makeText(ProfileActivity.this, (CharSequence) resultList, Toast.LENGTH_SHORT).show();
//                    }
                   // List<String> listUsers = Collections.singletonList(String.valueOf(task.getResult().getValue(String.class)));
//                   String username = String.valueOf(task.getResult().getValue());
//                   usernameText.setText(String.valueOf(task.getResult().getValue()));
//                    String usename = task.getResult().getValue(String.class);
//                    usernameText.setText(usename);
                    Log.d("firebase child value", String.valueOf(task.getResult().getValue()));
                    Toast.makeText(ProfileActivity.this, String.valueOf(task.getResult().getValue()) , Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(ProfileActivity.this, "Error retriving data", Toast.LENGTH_SHORT).show();
                    Log.e("firebase", "Error getting data", task.getException());
                }
            }
        }));
        usernameText.setText(firebaseResult);
//        userEmailText.setText(userEmail);
//        serviceNameText.setText(serviceName);
//        priceServiceText.setText(priceService);
//        priceTicketText.setText(priceTicket);

   }
}


//   databaseReference = (DatabaseReference) database.getInstance().getReference("service").addValueEventListener(new ValueEventListener() {
//                                       @Override
//                                       public void onDataChange(DataSnapshot dataSnapshot) {
//                                           ServiceApp serviceApp = dataSnapshot.getValue(ServiceApp.class);
//                                           Gson gson = new Gson();
//                                           String reqJson = gson.toJson(serviceApp);
//                                       }
//
//        @Override
//        public void onCancelled(@NonNull DatabaseError error) {
//
//        }
//    });



