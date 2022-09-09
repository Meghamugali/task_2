package com.example.task2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
     TextView tvName;
     TextView tvEmail;
     TextView tvAddress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Intent intent=getIntent();
        String name = getIntent().getExtras().getString("nkey");
        String email = getIntent().getExtras().getString("ekey");
        String address = getIntent().getExtras().getString("akey");

        Boolean cbread = getIntent().getExtras().getBoolean("ckey1");
        Boolean cbsing = getIntent().getExtras().getBoolean("ckey2");
        Boolean cbdance = getIntent().getExtras().getBoolean("ckey3");

        Boolean rbmale = getIntent().getExtras().getBoolean("rkey1");
        Boolean rbfemale = getIntent().getExtras().getBoolean("rkey2");


        tvName = findViewById(R.id.tvName);
        tvName.setText( name);
        tvEmail = findViewById(R.id.tvEmail);
        tvEmail.setText(email);
        tvAddress = findViewById(R.id.tvAddress);
        tvAddress.setText(address);









    }
}