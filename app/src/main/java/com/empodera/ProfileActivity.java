package com.empodera;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.PostProcessor;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.empodera.Model.ServiceApp;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.database.core.Tag;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.gson.Gson;

public class ProfileActivity extends AppCompatActivity {
 /*   private FirebaseAuthException auth;
    private FirebaseDatabase database;
    private DatabaseReference databaseReference = (DatabaseReference) database.getInstance().getReference();
    ServiceApp serviceApp = new ServiceApp();
    private ValueEventListener valueEventListener;

    Intent intent = getIntent();*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

/*    TextView serviceNameText = (TextView) findViewById(R.id.profile_service_name);
    TextView priceServiceText = (TextView) findViewById(R.id.profile_service_price);
    TextView priceTicketText = (TextView) findViewById(R.id.profile_price_ticket);

    String serviceName = intent.getStringExtra("serviceName");*/
//    String priceService = String.valueOf((intent.putExtra("priceService", priceServiceText.getText().toString())));
//    String priceTicket = String.valueOf(intent.putExtra("priceTicket", priceTicketText.getText().toString()));

    //serviceNameText.setText(serviceName);

//    FirebaseStorage firebaseStorage = FirebaseStorage.getInstance();
//    databaseReference = (DatabaseReference) database.getInstance().getReference("service").addValueEventListener(new ValueEventListener() {
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
}


