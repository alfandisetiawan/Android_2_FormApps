package com.alfandi.formapps;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText Input_Nama = findViewById(R.id.Input_Nama_login);
        EditText Input_Email = findViewById(R.id.Input_Email_login);
        EditText Input_Telepon =  findViewById(R.id.Input_Telepon_login);
        EditText Input_Password = findViewById(R.id.Input_Password_login);

        Button Button_Save = findViewById(R.id.Input_Button_login);
        Button_Save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("--Nama--", Input_Nama.getText().toString());
                Log.d("--Email--", Input_Email.getText().toString());
                Log.d("--Telepon--", Input_Telepon.getText().toString());
                Log.d("--Password--", Input_Password.getText().toString());
            }
        });
    }

}