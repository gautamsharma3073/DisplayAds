package com.example.displayads

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.displayads.db.ResDao
import com.example.displayads.model.ResourceData
import com.example.displayads.repos.Respository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repo: Respository) : ViewModel() {

    val resList = repo.getAllResources()

    fun insertResources(resourceData: ResourceData) = viewModelScope.launch(Dispatchers.IO) { repo.insertResources(resourceData) }

}
