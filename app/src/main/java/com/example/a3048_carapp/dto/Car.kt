package com.example.a3048_carapp.dto

data class Car(var brand : String, var models : String){
    override fun toString() : String {
        return "$brand $models"
    }
}