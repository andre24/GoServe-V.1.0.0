package com.example.andreas.goserve;

import android.content.ClipData;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MejaPelanggan extends AppCompatActivity {

    GridView mejaGridView;

    static final String[] letters = new String[] {
            "Meja 1", "Meja 2", "Meja 3", "Meja 4", "Meja 5","Meja 6"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meja_pelanggan);

        mejaGridView = (GridView) findViewById(R.id.mejaGridView);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, letters);

        mejaGridView.setAdapter(adapter);

        mejaGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), ((TextView) view).getText(),Toast.LENGTH_LONG).show();
            }
        });
    }

    public void onBackPressed(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setMessage("Do you want to Exit ?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
        /*
        super.onBackPressed();
        Toast.makeText(this, "Back pressed", Toast.LENGTH_LONG);
        */
    }


}
