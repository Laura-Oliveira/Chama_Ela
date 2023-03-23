package com.empodera.View;

import android.Manifest;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.provider.Settings;
import android.os.Bundle;
import android.view.View;

import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;

import com.empodera.R;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.empodera.Controller.RegisterServiceActivity;

public class SearchWorkerActivity extends FragmentActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_woker);

       /* val myDataset = Datasource().loadAffirmations();
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
                recyclerView.adapter = ItemAdapter(this, myDataset)
        recyclerView.setHasFixedSize(true)*/
    }

    public void registerService(View view)
    {
        Intent activity = new Intent(this, RegisterServiceActivity.class);
        startActivity(activity);
    }
}
