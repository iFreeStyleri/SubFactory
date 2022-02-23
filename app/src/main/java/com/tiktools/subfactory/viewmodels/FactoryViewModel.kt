package com.tiktools.subfactory.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FactoryViewModel : ViewModel() {
    private val cardSearch : MutableLiveData<Boolean> = MutableLiveData()
    init{
        cardSearch.value = false
    }
}