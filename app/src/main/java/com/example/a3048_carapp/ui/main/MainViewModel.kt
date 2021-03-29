package com.example.a3048_carapp.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.a3048_carapp.dto.Car
import com.example.a3048_carapp.service.CarService

class MainViewModel : ViewModel(){
    private var _cars: MutableLiveData<ArrayList<Car>> = MutableLiveData<ArrayList<Car>>()

    internal var cars:MutableLiveData<ArrayList<Car>>
        get() { return _cars}
        set(value) {_cars = value}
}