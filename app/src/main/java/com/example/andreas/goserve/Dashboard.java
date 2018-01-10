package com.example.andreas.goserve;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Dashboard extends AppCompatActivity {
    Button button1, button2, button3,
            button4, button5, button6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


    button1 = (Button) findViewById(R.id.button1);
    button1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(getApplicationContext(),"Meja Page Sukses",
                    Toast.LENGTH_SHORT).show();
            Intent intent = new Intent (Dashboard.this ,MejaPelanggan.class);
            Dashboard.this.startActivity(intent);
//            finish();
        }
    });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Report Sukses ",
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent (Dashboard.this ,ReportMenu.class);
                Dashboard.this.startActivity(intent);
//                finish();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Stok Page Sukses",
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent (Dashboard.this ,StockMenu.class);
                Dashboard.this.startActivity(intent);
//                finish();
            }
        });

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Branchmarket Sukses",
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent (Dashboard.this ,BranchMenu.class);
                Dashboard.this.startActivity(intent);
//                finish();
            }
        });

        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"About Sukses",
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent (Dashboard.this ,MejaPelanggan.class);
                Dashboard.this.startActivity(intent);
//                finish();
            }
        });

        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Exit Sukses",
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent (Dashboard.this ,MejaPelanggan.class);
                Dashboard.this.startActivity(intent);
//                finish();
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
    }
}
