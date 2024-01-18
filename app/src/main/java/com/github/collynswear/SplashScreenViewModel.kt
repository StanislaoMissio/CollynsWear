package com.github.collynswear

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class SplashScreenViewModel : ViewModel() {

    private val _ready = MutableStateFlow(false)
    val ready = _ready.asStateFlow()

    init {
        viewModelScope.launch {
            delay(3000L)
            _ready.value = true
        }
    }
}