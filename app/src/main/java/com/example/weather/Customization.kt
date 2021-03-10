package com.example.weather

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.CompoundButton
import androidx.appcompat.app.AppCompatActivity


class Customization : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customization)
    }

    fun onClickMainMenu (view: View){
        startActivity(Intent(applicationContext, Application::class.java))
    }

    fun onClickList (view: View){
        startActivity(Intent(applicationContext, List::class.java))
    }
}