package edu.uc.emiller.carapp.dao

import edu.uc.emiller.carapp.dto.Car
import androidx.room.*

@Database(entities=arrayOf(Car::class), version = 1)
abstract class CarDatabase : RoomDatabase() {
    abstract fun CarDAO() : ICarDAO
}