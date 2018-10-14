package com.example.delux.projecthealthcare;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Verify extends AppCompatActivity {

    EditText editText;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);

        editText = (EditText) findViewById(R.id.et_pass);
        button = (Button) findViewById(R.id.btn_submit);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    startActivity(new Intent(Verify.this, LoginDoctor.class));

            }
        });
    }
}
