package com.example.exams.database.dao;

import android.database.sqlite.SQLiteConstraintException;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.exams.database.entity.ExamEntity;

import java.util.List;

@Dao
public interface ExamDao {

    @Query("SELECT * FROM Exam WHERE idExam = :id")
    LiveData<ExamEntity> getById(String id);

    @Query("SELECT * FROM Exam")
    LiveData<List<ExamEntity>> getAll();

    @Insert
    long insert(ExamEntity examEntity) throws SQLiteConstraintException;

    @Update
    void update(ExamEntity examEntity);

    @Delete
    void delete(ExamEntity examEntity);

    @Query("DELETE FROM Exam")
    void deleteAll();

}
