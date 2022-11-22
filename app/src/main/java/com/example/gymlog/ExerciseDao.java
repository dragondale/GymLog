package com.example.gymlog;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface ExerciseDao {

    @Insert
    public void insertAll(Exercise... exercises);

    @Delete
    public void delete(Exercise exercise);

    @Query("SELECT * FROM Exercise")
    public List<Exercise> getAll();
}
