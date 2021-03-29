package com.example.a3048_carapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.GestureDetectorCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.a3048_carapp.ui.main.MainFragment
import com.example.a3048_carapp.ui.main.MainViewModel

class MainActivity : AppCompatActivity() {

    //private lateinit var detector: GestureDetectorCompat
    private lateinit var mainFragment: MainFragment
    private lateinit var activeFragment: Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainFragment = MainFragment.newInstance()
        val viewModel: MainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, mainFragment)
                    .commitNow()

            activeFragment = mainFragment
        }
    }
}