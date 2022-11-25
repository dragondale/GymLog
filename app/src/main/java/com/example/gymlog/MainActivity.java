package com.example.gymlog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements RecycleViewerInterface{

    public ArrayList<WorkoutName> testList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.rv_workout_plans);

        // Just for testing

        WorkoutName test1 = new WorkoutName("Monday");
        WorkoutName test2 = new WorkoutName("Tuesday");
        WorkoutName test3 = new WorkoutName("Friday");

        testList = new ArrayList<WorkoutName>();
        testList.add(test1);
        testList.add(test2);
        testList.add(test3);

        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(this, testList, this);

        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(MainActivity.this, PerformWorkoutActivity.class);
        intent.putExtra("NAME", testList.get(position).workoutName);
        startActivity(intent);
    }
}