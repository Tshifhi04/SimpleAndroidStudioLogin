package com.example.myapplicationlogin;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    private Bundle savedInstanceState;

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
                if (username.getText().toString().equals("1") && password.getText().toString().equals("1"))
                {
                    //Correct
                    Toast.makeText(MainActivity.this,"Login Successful",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this,Homepage.class);
                    startActivity(intent);
                }
                else
                    //incorrect
                    Toast.makeText(MainActivity.this,"Login Failed!!",Toast.LENGTH_SHORT).show();
            }
        });


    }


    public void click(View v) {
        Intent intent;
        switch(v.getId()) {
            case R.id.register: // R.id.textView1
                intent = new Intent(this, register.class);

                            }
    }
}

