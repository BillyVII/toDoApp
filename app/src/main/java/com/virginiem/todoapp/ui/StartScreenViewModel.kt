package com.virginiem.todoapp.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.virginiem.todoapp.ui.model.Entree
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class StartScreenViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(Entree())
    val uiState: StateFlow<Entree> = _uiState.asStateFlow()

    val entreesList = mutableListOf<Entree>(
        Entree("toto", "est platiste")
    )
    var word by mutableStateOf("")


    fun addWord(wordAdd:String){
        word = wordAdd
    }

    fun addEntree(){
        entreesList.add(
            Entree(word,"")
        )
    }

    fun displayList(list: List <String>){
        for(item in list){
            println(item)
        }
    }
}