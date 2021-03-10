package com.example.weather

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val load1:TextView = findViewById(R.id.Pro)
        val load2:TextView = findViewById(R.id.Weather)

        val animation1:Animation = AnimationUtils.loadAnimation(this, R.anim.translate)
        val animation2:Animation = AnimationUtils.loadAnimation(this, R.anim.translate)

        load1.startAnimation(animation1)
        load2.startAnimation(animation2)
    }

    fun onClickLayout (view: View){
        startActivity(Intent(applicationContext, Quick::class.java))
    }

}
