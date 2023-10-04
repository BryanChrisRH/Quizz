package com.example.quizz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.BotonEmpezar
import kotlinx.android.synthetic.main.activity_main.imageView3

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animation2:Animation= AnimationUtils.loadAnimation(this,R.anim.despasamiento_abajo)

        imageView3.setAnimation(animation2)
        BotonEmpezar.setAnimation(animation2)

        val botonempezar= findViewById<Button>(R.id.BotonEmpezar)
        botonempezar.setOnClickListener {
            val intent=Intent(applicationContext,ventana1::class.java)
            startActivity(intent)
            finish()
        }
    }
}