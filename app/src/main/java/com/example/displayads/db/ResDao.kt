package com.example.displayads.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.displayads.model.ResourceData

@Dao
interface ResDao {
    @Insert
    suspend fun addResource(resourceData: ResourceData)

    @Query("Select * from resources_tables")
    fun getAllResources() : LiveData<List<ResourceData>>

}