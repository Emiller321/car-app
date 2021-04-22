package edu.uc.emiller.carapp.dto

import androidx.room.*

/**
 * The Car DTO.
 *
 * Stores the make, model and year of a car.
 * @param make the brand of the car
 * @param model the model or series of the car
 * @param year the year of the series
 */
@Entity(tableName = "car")
data class Car(
        @ColumnInfo(name = "make")
        var make: String = "",

        @ColumnInfo(name = "model")
        var model: String = "",

        @ColumnInfo(name = "year")
        var year: Int = 0,

        @PrimaryKey var car_id: Int = 0
) {
    override fun toString(): String {
        return "$year $make $model"
    }
}