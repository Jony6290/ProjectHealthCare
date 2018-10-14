package com.example.delux.projecthealthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChatMain extends AppCompatActivity {

    Button doctor, patient;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_main);

        doctor = (Button) findViewById(R.id.btn_doctor_login);
        patient = (Button) findViewById(R.id.btn_patient_login);

        patient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ChatMain.this, ChatLogin.class));
            }
        });

        doctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ChatMain.this, Verify.class));
            }
        });
    }
}
