package com.example.gymlog;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity
public class WorkoutName {

    @PrimaryKey
    @NonNull
    public int workoutId;

    @ColumnInfo(name = "workout_name")
    public String workoutName;

    @Ignore
    public WorkoutName(String workoutName) {
        this.workoutName = workoutName;
    }

    public WorkoutName() {
        this.workoutName = "workout_name";
    }
}
