package com.example.studentform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Show extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        Intent intent = getIntent();

        String dep = intent.getStringExtra("department");
        String name = intent.getStringExtra("name");

        TextView studentName = findViewById(R.id.student_name);
        TextView studentDepartment = findViewById(R.id.student_department);
        studentName.setText(name);
        studentDepartment.setText(dep);
    }
}