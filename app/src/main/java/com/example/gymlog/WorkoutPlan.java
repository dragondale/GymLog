package com.example.gymlog;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class WorkoutPlan {

    @PrimaryKey
    public int id;

    @ColumnInfo(name = "template_id")
    public int templateId;

    @ColumnInfo(name = "exercise_number")
    public int exerciseNumber;

    @ColumnInfo(name = "set_number")
    public int setNumber;

    @ColumnInfo(name = "rep_number")
    public int repNumber;

    @ColumnInfo(name = "weight")
    public int weight;
}
