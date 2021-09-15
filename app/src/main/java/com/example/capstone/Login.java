package com.example.capstone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private Button buttonNext;
    private Button buttonExist;
    int MobileNumber;

    EditText MobileNumberInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        buttonExist = findViewById(R.id.Exist);
        buttonNext = findViewById(R.id.Submit);

        MobileNumberInput = findViewById(R.id.editTextPhone);
        if(MobileNumberInput.getText().toString().equals(""))
        {
            MobileNumberInput.setError("Please Enter Mobile Number and start with '63'");
        }
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MobileNumber = Integer.valueOf(MobileNumberInput.getText().toString());
                Toast.makeText(Login.this,"Good" , Toast.LENGTH_SHORT).show();
            }
        });
        buttonExist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, LoginNext.class);
                startActivity(intent);
            }
        });

    }

}

