package edu.uchicago.gerber.bar_flags

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    //1: mutableLiveData which can be observed throughout the app
    val mutableLiveData = MutableLiveData<String>()

    //2 one or more functions that mutate the liveData
    fun countryClick(country: String){
        mutableLiveData.value = country
    }

}