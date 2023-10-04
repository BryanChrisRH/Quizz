package com.example.quizz

import android.content.DialogInterface
import android.graphics.Color
import android.graphics.ColorFilter
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.color.utilities.Score.score
import kotlinx.android.synthetic.main.activity_ingles.ans_A
import kotlinx.android.synthetic.main.activity_ingles.ans_B
import kotlinx.android.synthetic.main.activity_ingles.ans_C
import kotlinx.android.synthetic.main.activity_ingles.ans_D
import kotlinx.android.synthetic.main.activity_ingles.question
import kotlinx.android.synthetic.main.activity_ingles.submit_btn
import kotlinx.android.synthetic.main.activity_ingles.total_question


class ActivityIngles : AppCompatActivity(),View.OnClickListener {
    var count: Int =0
    var  totalQuestion: Int = PreguntasRepuestas.preguntas.size
    var indicePregunta: Int = 0
    var selecion: String= ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingles)
        total_question.text = "Preguntas en Total: "+totalQuestion

        val animation1: Animation = AnimationUtils.loadAnimation(this,R.anim.left_anim)
        ans_A.setAnimation(animation1)
        ans_B.setAnimation(animation1)
        ans_C.setAnimation(animation1)
        ans_D.setAnimation(animation1)
        submit_btn.setAnimation(animation1)
        total_question.setAnimation(animation1)
        question.setAnimation(animation1)

        ans_A.setOnClickListener(this)
        ans_B.setOnClickListener(this)
        ans_C.setOnClickListener(this)
        ans_D.setOnClickListener(this)
        submit_btn.setOnClickListener(this)
        cargaPregunta()

    }

    override fun onClick(view: View){
        ans_A.setBackgroundColor(Color.rgb(0,88,44))
        ans_B.setBackgroundColor(Color.rgb(0,88,44))
        ans_C.setBackgroundColor(Color.rgb(0,88,44))
        ans_D.setBackgroundColor(Color.rgb(0,88,44))

        val clickedButton = view as Button
        if (clickedButton.id==R.id.submit_btn){
            if (selecion == PreguntasRepuestas.corretas[indicePregunta]){
                count++

            }
            indicePregunta++
            cargaPregunta()

        }else{
            selecion=clickedButton.text.toString()
            clickedButton.setBackgroundColor(Color.MAGENTA)
        }
    }

    fun cargaPregunta(){
        if (indicePregunta == totalQuestion){
            finishQuiz()
            return
        }
        total_question.text = PreguntasRepuestas.preguntas[indicePregunta]
        ans_A.text = PreguntasRepuestas.opciones[indicePregunta][0]
        ans_B.text= PreguntasRepuestas.opciones[indicePregunta][1]
        ans_C.text= PreguntasRepuestas.opciones[indicePregunta][2]
        ans_D.text= PreguntasRepuestas.opciones[indicePregunta][3]
    }

    fun finishQuiz(){
        var Status: String=""
        if (count > totalQuestion*0.60){
            Status="Felicidades"
        }else{
            Status="Sigue Intentando"
        }

        AlertDialog.Builder(this)
            .setTitle(Status)
            .setMessage("$Status tu puntuntacion es: $count de: $totalQuestion")
            .setPositiveButton("Reiniciar",
                DialogInterface.OnClickListener { dialogInterface: DialogInterface?, i: Int -> reiniciar() })
            .setCancelable(false)
            .show()
    }

    fun reiniciar(){
        count=0
        indicePregunta=0
        cargaPregunta()
    }
}



