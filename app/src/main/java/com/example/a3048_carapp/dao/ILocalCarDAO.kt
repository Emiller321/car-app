package com.example.a3048_carapp.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.a3048_carapp.dto.Car

@Dao
interface ILocalCarDAO {
    @Query("SELECT * FROM car")
    fun getAllCars() : LiveData<List<Car>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(cars: ArrayList<Car>)
}