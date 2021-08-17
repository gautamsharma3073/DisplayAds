package com.example.displayads.repos

import com.example.displayads.db.ResDao
import com.example.displayads.model.ResourceData
import javax.inject.Inject

class Respository @Inject constructor(val dao: ResDao) {

    suspend fun insertResources(resourceData: ResourceData) {
        dao.addResource(resourceData)
    }

    fun getAllResources() = dao.getAllResources()
}