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

    private val entreesList = mutableListOf<String>()
    private var word by mutableStateOf("")

    fun addWord(wordAdd:String){
        word = wordAdd
        entreesList.add(word)
    }

    fun addEntree(wordAdd: String){
        // val entreesList = mutableListOf<String>()
        entreesList.add("toto")
        entreesList.add("titi")
        entreesList.add("tata")
        entreesList.add(wordAdd)

        displayList(entreesList)

       /* for (entree in entreesList) {
            println(entree)
        }*/
    }

    fun displayList(list: List <String>){
        for(item in list){
            println(item)
        }
    }
}