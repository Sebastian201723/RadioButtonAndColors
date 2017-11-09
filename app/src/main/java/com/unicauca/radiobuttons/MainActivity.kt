package com.unicauca.radiobuttons

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        amarillo.setOnClickListener(this::changeColor)
        azul.setOnClickListener(this::changeColor)
        rojo.setOnClickListener(this::changeColor)

    }
    fun changeColor(view: View){
        when{
            amarillo.isChecked -> window.decorView.setBackgroundColor(Color.parseColor("#FFFF00"))

            azul.isChecked -> window.decorView.setBackgroundColor(Color.parseColor("#0000FF"))

            rojo.isChecked -> window.decorView.setBackgroundColor(Color.parseColor("#FF0000"))
        }
    }
}
