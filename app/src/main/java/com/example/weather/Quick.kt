package com.example.weather

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout

class Quick : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quick)
    }

    fun onClickButton (view: View){
        startActivity(Intent(applicationContext, Stable::class.java))
    }

    fun onClickTextView (view: View){
        val clayout = findViewById<ConstraintLayout>(R.id.clayout)
        val layoutinfo = findViewById<ConstraintLayout>(R.id.layoutinfo)
        val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.alpha)
        val animation2: Animation = AnimationUtils.loadAnimation(this, R.anim.scale)

        if (clayout.visibility == View.INVISIBLE){
            clayout.visibility = View.VISIBLE
            val bNextTip = findViewById<Button>(R.id.nextTip)
            bNextTip.isEnabled = false
            clayout.startAnimation(animation)
            layoutinfo.startAnimation(animation2)
        }
        else {
            onClickMainLayout(view)
        }
    }
    fun onClickMainLayout(view: View) {
        val clayout = findViewById<ConstraintLayout>(R.id.clayout)
        val layoutinfo = findViewById<ConstraintLayout>(R.id.layoutinfo)
        val animation3:Animation = AnimationUtils.loadAnimation(this, R.anim.alphaback)
        val animation4:Animation = AnimationUtils.loadAnimation(this, R.anim.scaleback)
        clayout.visibility = View.INVISIBLE
        val bNextTip = findViewById<Button>(R.id.nextTip)
        bNextTip.isEnabled = true
        clayout.startAnimation(animation3)
        layoutinfo.startAnimation(animation4)
    }
}

