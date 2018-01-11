package com.example.andreas.goserve.menu;

import android.content.ClipData;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.andreas.goserve.R;

import java.util.ArrayList;

public class BranchMenu extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branch_menu);
    }
    public void onBackPressed(){
        super.onBackPressed();
    }
}
