package com.empodera.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.empodera.Model.ServiceApp;
import com.empodera.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ProfileActivity extends AppCompatActivity {
    private DatabaseReference firebaseDatabase = FirebaseDatabase.getInstance().getReference();
    ServiceApp serviceApp = new ServiceApp();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        TextView usernameText = findViewById(R.id.profile_user_name);
        TextView userEmailText = findViewById(R.id.profile_user_email);
        TextView userPhoneText = findViewById(R.id.profile_user_phone);
        TextView serviceNameText = findViewById(R.id.profile_service_name);
        TextView priceServiceText = findViewById(R.id.profile_service_price);
        TextView priceTicketText = findViewById(R.id.profile_price_ticket);

        firebaseDatabase.child("user").child("-NPZUUObPJpwgCrNjbk9").child("name").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists())
                {
                    String data = dataSnapshot.getValue(String.class);

                    if (data != null)
                    {
                        usernameText.setText(data);
                    }
                    else
                    {
                        usernameText.setText("String nula");
                    }
                }
                else
                {
                    usernameText.setText("Dados não encontrados");
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError)
            {
                Log.e("ProfileActivity", "Erro ao ler dados do banco de dados: " + databaseError.getMessage());
            }
        });

     /*   firebaseDatabase.child("user").child("-NPZUUObPJpwgCrNjbk9").child("email").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists())
                {
                    String data = dataSnapshot.getValue(String.class);

                    if (data != null)
                    {
                        userEmailText.setText(data);
                    }
                    else
                    {
                        usernameText.setText("String nula");
                    }
                }
                else
                {
                    usernameText.setText("Dados não encontrados");
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError)
            {
                Log.e("ProfileActivity", "Erro ao ler dados do banco de dados: " + databaseError.getMessage());
            }
        });

        firebaseDatabase.child("user").child("-NPZUUObPJpwgCrNjbk9").child("phone").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists())
                {
                    String data = dataSnapshot.getValue(String.class);

                    if (data != null)
                    {
                        userPhoneText.setText(data);
                    }
                    else
                    {
                        usernameText.setText("String nula");
                    }
                }
                else
                {
                    usernameText.setText("Dados não encontrados");
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError)
            {
                Log.e("ProfileActivity", "Erro ao ler dados do banco de dados: " + databaseError.getMessage());
            }
        });

        firebaseDatabase.child("service").child("-NPdA9fJElXyZiDLNdbe").child("serviceName").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists())
                {
                    String data = dataSnapshot.getValue(String.class);

                    if (data != null)
                    {
                        serviceNameText.setText(data);
                    }
                    else
                    {
                        usernameText.setText("String nula");
                    }
                }
                else
                {
                    usernameText.setText("Dados não encontrados");
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError)
            {
                Log.e("ProfileActivity", "Erro ao ler dados do banco de dados: " + databaseError.getMessage());
            }
        });

        firebaseDatabase.child("service").child("-NPdA9fJElXyZiDLNdbe").child("priceService").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists())
                {
                    String data = dataSnapshot.getValue(String.class);

                    if (data != null)
                    {
                        priceServiceText.setText(data);
                    }
                    else
                    {
                        usernameText.setText("String nula");
                    }
                }
                else
                {
                    usernameText.setText("Dados não encontrados");
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError)
            {
                Log.e("ProfileActivity", "Erro ao ler dados do banco de dados: " + databaseError.getMessage());
            }
        });

        firebaseDatabase.child("service").child("-NPdA9fJElXyZiDLNdbe").child("priceTicket").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists())
                {
                    String data = dataSnapshot.getValue(String.class);

                    if (data != null)
                    {
                        priceTicketText.setText(data);
                    }
                    else
                    {
                        usernameText.setText("String nula");
                    }
                }
                else
                {
                    usernameText.setText("Dados não encontrados");
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError)
            {
                Log.e("ProfileActivity", "Erro ao ler dados do banco de dados: " + databaseError.getMessage());
            }
        }); */
    }
}


