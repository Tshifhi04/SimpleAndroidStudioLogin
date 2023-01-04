package com.example.myapplicationlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username= findViewById(R.id.Username);
        TextView password= findViewById(R.id.Password);

        MaterialButton loginBtn =(MaterialButton) findViewById(R.id.loginBtn);
        // Tshifhiwa and admin
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("Tshifhiwa") && password.getText().toString().equals("admin"))
                {
                    //Correct
                    Toast.makeText(MainActivity.this,"Login Successful",Toast.LENGTH_SHORT).show();
                }
                else
                    //incorrect
                    Toast.makeText(MainActivity.this,"Login Failed!!",Toast.LENGTH_SHORT).show();
            }
        });

    }
}