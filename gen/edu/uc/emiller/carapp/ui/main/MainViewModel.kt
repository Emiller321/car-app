package edu.uc.emiller.carapp.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData
import edu.uc.emiller.carapp.dto.Car

class MainViewModel : ViewModel() {
    private var _cars: MutableLiveData<ArrayList<Car>> = MutableLiveData<ArrayList<Car>>()
    private var _car = Car()

    internal var cars: MutableLiveData<ArrayList<Car>>
        get() {return _cars}
        set(value) {_cars = value}

    internal var car: Car
        get() {return _car}
        set(value) {_car = value}
}