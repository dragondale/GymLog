package com.example.gymlog;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class ExerciseHistory {

    @PrimaryKey
    public int id;

    @ColumnInfo(name = "workout_number")
    public int workoutNumber;

    @ColumnInfo(name = "exercise_id")
    public int exerciseId;

    @ColumnInfo(name = "exercise_number")
    public int exerciseNumber;

    @ColumnInfo(name = "set_number")
    public int setNumber;

    // if repNumber is set to 0, the exercise is timed and weight parameter is time in seconds
    @ColumnInfo(name = "rep_number")
    public int repNumber;

    // if repNumber and weight are both set to 0, the exercise will try to show user's
    // note instead, for example "max". This note is set in a different table to save
    // resources as it probably won't be used often.
    @ColumnInfo(name = "weight")
    public int weight;

    public ExerciseHistory() {
        this.workoutNumber = 0;
        this.exerciseId = 0;
        this.exerciseNumber = 0;
        this.setNumber = 0;
        this.repNumber = 0;
        this.weight = 0;
    }
}
