package com.example.a3048_carapp.dao

import com.example.a3048_carapp.dto.Car
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ICarDAO {

    @GET("https://raw.githubusercontent.com/matthlavacka/car-list/master/car-list.json")
    fun getAllCars(): Call<ArrayList<Car>>

    @GET("https://raw.githubusercontent.com/matthlavacka/car-list/master/car-list.json")
    fun getCars(@Query("Combined_Name") brand:String): Call<ArrayList<Car>>
}