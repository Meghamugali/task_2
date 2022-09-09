package com.example.task2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etName;
    EditText etEmailAddress;
    EditText etPostalAddress;
    CheckBox cbread;
    CheckBox cbsing;
    CheckBox cbdance;
    RadioButton rbmale;
    RadioButton rbfemale;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName = findViewById(R.id.etName);
        etEmailAddress = findViewById(R.id.etEmailAddress);
        etPostalAddress = findViewById(R.id.etPostalAddress);
        cbread = findViewById(R.id.cbread);
        cbsing = findViewById(R.id.cbsing);
        cbdance = findViewById(R.id.cbdance);
        rbmale = findViewById(R.id.rbmale);
        rbfemale = findViewById(R.id.rbfemale);



    }

    public void ClickHandler(View viewClicked){

        String name = etName.getText().toString();
        String email = etEmailAddress.getText().toString();
        String address = etPostalAddress.getText().toString();

        Toast.makeText(this,name+"\n"+address+"\n"+email+"\n", Toast.LENGTH_SHORT).show();
        boolean isReading = cbread.isChecked();
        boolean isSinging= cbsing.isChecked();
        boolean isDancing = cbdance.isChecked();

        if (isReading ){
            Toast.makeText(this, "hobby is reading", Toast.LENGTH_SHORT).show();
        }
        else if(isSinging){
            Toast.makeText(this, "hobby is singing", Toast.LENGTH_SHORT).show();
        }
        else if(isDancing) {
            Toast.makeText(this, "hobby is dancing", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "No hobbies selected", Toast.LENGTH_SHORT).show();
        }

        boolean isMale = rbmale.isChecked();
        boolean isFemale = rbfemale.isChecked();
        if(isMale){
            Toast.makeText(this, "Male", Toast.LENGTH_SHORT).show();
        }
        else if(isFemale) {
            Toast.makeText(this, "Female", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "please select gender", Toast.LENGTH_SHORT).show();
        }
        Intent intent = new Intent(this, HomeActivity.class);
        intent.putExtra("nkey",name);
        intent.putExtra("ekey",email);
        intent.putExtra("akey",address);
        intent.putExtra("ckey1", cbread.isChecked());
        intent.putExtra("ckey2", cbsing.isChecked());
        intent.putExtra("ckey3", cbdance.isChecked());
        intent.putExtra("rkey1", rbmale.isChecked());
        intent.putExtra("rkey2", rbfemale.isChecked());

        startActivity(intent);

    }
}