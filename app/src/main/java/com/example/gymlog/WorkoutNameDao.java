package com.example.gymlog;

import static androidx.room.OnConflictStrategy.IGNORE;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Ignore;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface WorkoutNameDao {

    @Insert(onConflict = IGNORE)
    void insertItem(WorkoutName workoutName);

    @Delete
    void deleteItem(WorkoutName workoutName);

    @Query("SELECT * FROM WorkoutName")
    LiveData<List<WorkoutName>> getAllItems();

}
