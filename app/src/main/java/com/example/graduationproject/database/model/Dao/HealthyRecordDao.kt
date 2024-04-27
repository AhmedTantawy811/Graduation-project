package com.example.graduationproject.database.model.Dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface HealthyRecordDao {
    @Query("SELECT * FROM table_HealthyRecord")
    fun getAll(): List<HealthyRecordDao>
    @Insert
    fun insertTask(todo: HealthyRecordDao)
    @Update
    fun updateTask(todo: HealthyRecordDao)
    @Delete
    fun deleteTask(todo: HealthyRecordDao)
    @Query("SELECT * FROM table_HealthyRecord ORDER BY id DESC LIMIT 1")
    fun getLastRecord():List<HealthyRecordDao>
}