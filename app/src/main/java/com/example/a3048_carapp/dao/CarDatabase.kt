package com.example.a3048_carapp.dao

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.a3048_carapp.dto.Car

@Database(entities =  arrayOf(Car::class), version = 1)
abstract class CarDatabase : RoomDatabase() {
    abstract fun localCarDAO() : ILocalCarDAO
}