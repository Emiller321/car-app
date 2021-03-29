package com.example.a3048_carapp.ui.main

import androidx.lifecycle.viewModelScope
import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.a3048_carapp.service.CarService
import kotlinx.coroutines.launch

class ApplicationViewModel(application: Application) : AndroidViewModel(application) {
    private var _carService: CarService = CarService(application)

    init {
        fetchCars("e")
    }

    fun fetchCars(carName: String) {
        viewModelScope.launch{
            _carService.fetchCars(carName)
        }
    }

    internal var carService : CarService
        get() {return _carService}
        set(value) {_carService = value}
}