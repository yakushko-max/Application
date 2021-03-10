package com.example.weather

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlin.collections.List

class List : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
    }

    fun onClickMainMenu (view: View){
        startActivity(Intent(applicationContext, Application::class.java))
    }

    fun onClickCustomization (view: View){
        startActivity(Intent(applicationContext, Customization::class.java))
    }
}