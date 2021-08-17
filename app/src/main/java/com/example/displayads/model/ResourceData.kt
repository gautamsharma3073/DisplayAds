package com.example.displayads.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "resources_tables")
data class ResourceData(@PrimaryKey(autoGenerate = true) val id:Int,val resDir:String,val resType:String)
