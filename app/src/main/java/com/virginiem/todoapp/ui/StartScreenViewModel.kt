package com.virginiem.todoapp.ui

import androidx.lifecycle.ViewModel
import com.virginiem.todoapp.ui.model.Entree
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class StartScreenViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(Entree())
    val uiState: StateFlow<Entree> = _uiState.asStateFlow()
}