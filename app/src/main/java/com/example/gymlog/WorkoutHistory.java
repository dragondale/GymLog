package com.example.gymlog;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity
public class WorkoutHistory {

    @PrimaryKey
    public int id;

    @ColumnInfo(name = "training_number")
    public int trainingNumber;

    // training date

    // it isn't the same as training name in WorkoutPlan. In WorkoutPlan user can
    // delete/change names but the old one has to be stored.
    @ColumnInfo(name = "training_name")
    public String trainingName;

    public WorkoutHistory() {
        this.trainingNumber = 0;
        this.trainingName = "training_name";
    }
}
