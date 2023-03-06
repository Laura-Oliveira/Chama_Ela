package com.empodera.Controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.empodera.Model.ServiceApp;
import com.empodera.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterServiceActivity extends AppCompatActivity
{
    View view;
    private DatabaseReference database = FirebaseDatabase.getInstance().getReference();

    private EditText service_name, price_service, price_ticket;
    private CheckBox checkbox_cake, checkbox_hair_style, checkbox_chef;
    private TextView check_cake, check_hair_style, check_chef;

    private String txt_service_name;
    private float float_price_service, float_price_ticket;

  //  private CheckBox checkbox_nails, checkbox_color_hair, checkbox_lunch, checkbox_pizza;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_service);

     /*   view = findViewById(R.id.screen_register_service);
        view.setBackgroundColor(getResources().getColor(R.color.color_background)); */

        service_name = findViewById(R.id.register_service_name_edit_text);

     /*   checkbox_cake = findViewById(R.id.checkbox_cake);
        checkbox_hair_style = findViewById(R.id.checkbox_hair_style);
        checkbox_chef = findViewById(R.id.checkbox_chef);
        check_cake = findViewById(R.id.txt_check_cake);
        check_chef = findViewById(R.id.txt_check_chef);
        check_hair_style = findViewById(R.id.txt_check_hair_style);
        checkbox_lunch = findViewById(R.id.checkbox_lunch);
        checkbox_pizza = findViewById(R.id.check_box_pizza);
        checkbox_nails = findViewById(R.id.checkbox_nails);
        checkbox_color_hair = findViewById(R.id.checkbox_color_hair); */
        price_service = findViewById(R.id.register_service_price_edit_text);
        price_ticket = findViewById(R.id.register_service_price_ticket_edit_text);
    }

    public void registerService(View view)
    {
        String serviceOptions = "";
        ServiceApp serviceApp = new ServiceApp();

        /* TAkes the database reference */
        DatabaseReference dbReferenceInstance = database.getRef();

        /* Create a child Service in each instance created */
        DatabaseReference dbReference = dbReferenceInstance.child("service");

        /* Converting EditText type into String type */
        txt_service_name = service_name.getText().toString();

        /* Converting EditText type into String type for can covert into FLoat type */
        float_price_service = Float.parseFloat(price_service.getText().toString());
        float_price_ticket = Float.parseFloat(price_ticket.getText().toString());

    /*    if(checkbox_cake.isChecked())
        {
            serviceOptions+= (check_cake.getText().toString()+ "\n");
        }
        if(checkbox_chef.isChecked())
        {
            serviceOptions+= (check_chef.getText().toString()+ "\n");
        }
        if(checkbox_hair_style.isChecked())
        {
            serviceOptions+= (check_hair_style.getText().toString()+ "\n");
        } */

     //   if(serviceOptions!= "" || serviceOptions!= " ")
    //    {
            dbReference = database.getDatabase().getReference("service");

            /* Setting data into ServiceApp class */
            serviceApp.setServiceName(txt_service_name);
            serviceApp.setPriceService(float_price_service);
            serviceApp.setPriceTicket(float_price_ticket);
            //serviceApp.setTypeService(serviceOptions);
            //  serviceApp.setTypeService(type_service);

            /* Transfering data into Firebase object reference */
            serviceApp.setId(dbReference.push().getKey());

            /* Data ransfered from object to Firebase database */
            dbReference.child(serviceApp.getId()).setValue(serviceApp);

            Intent intenet = new Intent(RegisterServiceActivity.this, LoginActivity.class);
            startActivity(intenet);
            Toast.makeText(this, "Serviço Registrado com Sucesso!", Toast.LENGTH_LONG).show();
     /*   }
        else
        {
            Toast.makeText(this, "Preencha todos os campos obrigatórios", Toast.LENGTH_SHORT).show();
        } */
    }
}
