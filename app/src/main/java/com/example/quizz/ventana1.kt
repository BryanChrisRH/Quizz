package com.example.quizz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_ventana1.imageButton2
import kotlinx.android.synthetic.main.activity_ventana1.imageButton3
import kotlinx.android.synthetic.main.activity_ventana1.imageButton4


class ventana1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ventana1)

        val animation1: Animation = AnimationUtils.loadAnimation(this,R.anim.despasamiento_arriba)

        imageButton2.setAnimation(animation1)
        imageButton3.setAnimation(animation1)
        imageButton4.setAnimation(animation1)

        val botonIngles = findViewById<ImageButton>(R.id.imageButton2)
        val botonMatematica = findViewById<ImageButton>(R.id.imageButton3)
        val botonMedicina = findViewById<ImageButton>(R.id.imageButton4)

        botonIngles.setOnClickListener(){
            val intent=Intent(applicationContext,ActivityIngles::class.java)
            startActivity(intent)
        }

        botonMatematica.setOnClickListener(){
            val intent=Intent(applicationContext,MateActivity::class.java)
            startActivity(intent)
        }

    }


}




