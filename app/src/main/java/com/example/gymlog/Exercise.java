package com.example.gymlog;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Exercise {

    @PrimaryKey
    public int exerciseId;

    @ColumnInfo(name = "exercise_name")
    public String exerciseName;

    public Exercise() {
        this.exerciseName = exerciseName;
    }
}
