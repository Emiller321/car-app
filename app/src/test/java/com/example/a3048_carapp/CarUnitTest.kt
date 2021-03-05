package com.example.a3048_carapp

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.a3048_carapp.dto.Car
import com.example.a3048_carapp.ui.main.MainViewModel
import org.junit.Test

import org.junit.Assert.*
import org.junit.Rule
import org.junit.rules.TestRule

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class CarUnitTest {

    @get:Rule
    var rule: TestRule = InstantTaskExecutorRule()
    lateinit var mvm: MainViewModel

    @Test
    fun confirmToyotaCamry_outputsToyotaCamry() {
        var car: Car = Car("Toyota", "Camry")
        assertEquals("Toyota Camry", car.toString())
    }
}