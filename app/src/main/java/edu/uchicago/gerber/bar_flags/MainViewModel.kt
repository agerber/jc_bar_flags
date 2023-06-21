package edu.uchicago.gerber.bar_flags

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    //use similar structure for viewModel prop members as capitals_quiz app
    private val _country = mutableStateOf("ukraine")
    val country: State<String> = _country

    fun countryClick(country: String){
        _country.value = country
    }

}