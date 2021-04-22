package edu.uc.emiller.carapp.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import edu.uc.emiller.carapp.dto.Car

@Dao
interface ICarDAO {

    @Query("SELECT * FROM car")
    fun getAllCars() : LiveData<List<Car>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(cars : ArrayList<Car>)

    @Insert
    fun save(car : Car)

    @Delete
    fun delete(car : Car)

}