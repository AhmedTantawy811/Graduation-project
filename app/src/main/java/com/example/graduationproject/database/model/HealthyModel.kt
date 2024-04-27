package com.example.graduationproject.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "table_HealthyRecord")
    data class HealthyModel(
    @PrimaryKey(autoGenerate = true)
       val  id:Int,
    @ColumnInfo()
       val numRecord:Int,
    @ColumnInfo
    val date: Date?=null,
)
