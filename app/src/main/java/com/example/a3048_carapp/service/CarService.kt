package com.example.a3048_carapp.service

import android.app.Application
import androidx.room.Room
import com.example.a3048_carapp.RetrofitClientInstance
import com.example.a3048_carapp.dao.CarDatabase
import com.example.a3048_carapp.dao.ICarDAO
import com.example.a3048_carapp.dao.ILocalCarDAO
import com.example.a3048_carapp.dto.Car
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.withContext
import retrofit2.Call

class CarService(application: Application) {
    private val application = application

    internal suspend fun fetchCars(carName: String){
        withContext(Dispatchers.IO){
            val service: ICarDAO? = RetrofitClientInstance.retrofitInstance?.create(ICarDAO::class.java)
            val cars: Deferred<Call<ArrayList<Car>>?> = async {service?.getAllCars()}
        }
    }

    internal fun getLocalCarDAO() : ILocalCarDAO {
        val db = Room.databaseBuilder(application, CarDatabase::class.java, "carlist").build()
        val localCarDAO = db.localCarDAO()
        return localCarDAO
    }
}