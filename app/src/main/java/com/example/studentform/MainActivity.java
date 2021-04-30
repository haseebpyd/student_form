package com.example.studentform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText fullName;
    RadioButton BSSE, BSCS ,BSIT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fullName = findViewById(R.id.full_name);
        BSSE = findViewById(R.id.bsse);
        BSCS = findViewById(R.id.bscs);
        BSIT = findViewById(R.id.bsit);
        Button submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get data from EditText
                String name = fullName.getText().toString();
                String department = (BSSE.isChecked()? "BSSE": BSCS.isChecked()? "BSCS":BSIT.isChecked()? "BSIT": "");

                Intent intent = new Intent(MainActivity.this, Show.class);
                intent.putExtra("name", name);
                intent.putExtra("department", department);

                startActivity(intent);
            }
        });


    }

}