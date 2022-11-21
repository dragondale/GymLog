package com.example.gymlog;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class WorkoutName {

    @ColumnInfo(name = "workout_id")
    public int workoutId;

    @ColumnInfo(name = "workout_name")
    public String workoutName;
}
