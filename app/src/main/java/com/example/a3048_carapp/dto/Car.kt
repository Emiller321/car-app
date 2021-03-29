package com.example.a3048_carapp.dto

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "car")
data class Car(@PrimaryKey var brand : String, var models: String) {
    override fun toString(): String {
        return "$brand $models"
    }
}