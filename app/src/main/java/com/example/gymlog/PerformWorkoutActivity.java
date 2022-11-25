package com.example.gymlog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PerformWorkoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perform_workout);

        String name = "You selected ";
        name += getIntent().getStringExtra("NAME");
        name += " workout plan.";
        TextView textView = findViewById(R.id.tv_information);
        textView.setText(name);
    }
}