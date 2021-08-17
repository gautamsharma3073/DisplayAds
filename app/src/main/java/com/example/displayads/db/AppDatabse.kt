package com.example.displayads.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.displayads.model.ResourceData

@Database(entities = [ResourceData::class],version = 1,exportSchema = false)
abstract class `AppDatabase` : RoomDatabase() {

    abstract fun getResDao() : ResDao

}