package com.example.displayads.DI

import android.content.Context
import androidx.room.Room
import com.example.displayads.db.AppDatabase
import com.example.displayads.db.ResDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RoomModule {

    @Singleton
    @Provides
    fun getDbName(): String = "res_db"

    @Singleton
    @Provides
    fun getDb(@ApplicationContext context: Context, dbName: String): AppDatabase =
        Room.databaseBuilder(context,AppDatabase::class.java,dbName).build()

    @Singleton
    @Provides
    fun getDao(db: AppDatabase): ResDao = db.getResDao()

}