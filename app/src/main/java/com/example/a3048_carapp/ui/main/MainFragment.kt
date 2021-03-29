package com.example.a3048_carapp.ui.main

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.main_fragment.*
import com.example.a3048_carapp.R

class MainFragment : Fragment() {

    private lateinit var applicationViewModel: ApplicationViewModel
    internal lateinit var viewModel: MainViewModel

    companion object {
        fun newInstance() = MainFragment()
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    @SuppressLint("FragmentLiveDataObserve")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        applicationViewModel = ViewModelProvider(this).get(ApplicationViewModel::class.java)

        applicationViewModel.carService.getLocalCarDAO().getAllCars().observe(this, Observer {
            cars -> actCarBrand.setAdapter(ArrayAdapter(context!!, R.layout.support_simple_spinner_dropdown_item, cars))
        })

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        /*
        viewModel.cars.observe(this, Observer {
            cars -> actCarBrand.setAdapter(ArrayAdapter(context!!, R.layout.support_simple_spinner_dropdown_item, cars))
        })*/
    }
}