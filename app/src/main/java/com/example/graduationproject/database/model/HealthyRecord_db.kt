package com.example.graduationproject.database.model

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.graduationproject.database.model.Dao.HealthyRecordDao

@Database(entities = [HealthyModel::class], version = 1)
abstract class HealthyRecord_db : RoomDatabase() {
    abstract fun userDao(): HealthyRecordDao
    companion object {
        private const val DATABASE_NAME = "HealthyRecord-Database"
        private var healthyRecordDatabaseInstance: HealthyRecord_db? = null

        fun getInstance(context: Context): HealthyRecord_db {
            if (healthyRecordDatabaseInstance == null) {
                healthyRecordDatabaseInstance = Room.databaseBuilder(
                    context.applicationContext,
                    HealthyRecord_db::class.java,
                    DATABASE_NAME
                )
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build()
            }
            return healthyRecordDatabaseInstance!!
        }
    }
}