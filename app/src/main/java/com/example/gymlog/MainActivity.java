package com.example.gymlog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.rv_workout_plans);

        // Just for testing

        WorkoutName test1 = new WorkoutName("Monday");
        WorkoutName test2 = new WorkoutName("Tuesday");
        WorkoutName test3 = new WorkoutName("Friday");

        ArrayList<WorkoutName> testList = new ArrayList<WorkoutName>();
        testList.add(test1);
        testList.add(test2);
        testList.add(test3);

        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(this, testList);

        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}