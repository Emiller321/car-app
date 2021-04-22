package edu.uc.emiller.carapp.service

import android.app.Application
import android.content.ContentValues.TAG
import android.util.Log
import androidx.room.Room
import edu.uc.emiller.carapp.dao.CarDatabase
import edu.uc.emiller.carapp.dao.ICarDAO
import edu.uc.emiller.carapp.dto.Car

class CarService(application: Application) {
    private val application = application

    /**
     * Store cars locally using Room database
     */
    private suspend fun updateCars(cars: ArrayList<Car>?) {
        try {
            var carDAO = getCarDAO()
            carDAO.insertAll(cars!!)
        }catch (e: Exception) {
            Log.e(TAG, e.message!!)
        }
    }

    internal fun getCarDAO(): ICarDAO {
        val db = Room.databaseBuilder(application, CarDatabase::class.java, "myCars").build()
        val carDAO = db.CarDAO()
        return carDAO
    }

    internal fun save(car: Car) {
        getCarDAO().save(car)
    }
}