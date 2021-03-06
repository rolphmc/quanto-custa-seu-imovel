package com.avaliadorimovel.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.avaliadorimovel.details.DetailsActivity
import com.avaliadorimovel.R
import com.avaliadorimovel.main.interfaces.InterfaceMainView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), InterfaceMainView {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_apartamento.setOnClickListener {navigateToDetailsApartment()}
    }

    override fun navigateToDetailsHouse() {
        TODO("Not yet implemented")
    }

    override fun navigateToDetailsApartment() {
        startActivity(Intent(this, DetailsActivity::class.java))
    }

    override fun navigateToHelp() {
        TODO("Not yet implemented")
    }
}