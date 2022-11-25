package com.example.gymlog;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Ignore;
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

    @Ignore
    public WorkoutPlan(int templateId, int exerciseNumber, int setNumber, int repNumber, int weight) {
        this.templateId = templateId;
        this.exerciseNumber = exerciseNumber;
        this.setNumber = setNumber;
        this.repNumber = repNumber;
        this.weight = weight;
    }

    public WorkoutPlan() {
        this.exerciseNumber = 0;
        this.setNumber = 0;
        this.repNumber = 0;
        this.weight = 0;
    }
}
