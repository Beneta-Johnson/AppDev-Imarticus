package com.examples

import androidx.lifecycle.ViewModel

class HomeViewModel:ViewModel() {
    var count = 0

    fun incrementCount(){
        count++
    }
}