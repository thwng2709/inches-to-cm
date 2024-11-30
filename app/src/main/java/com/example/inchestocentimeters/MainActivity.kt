package com.example.inchestocentimeters

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var input: EditText
    private lateinit var btnConvert: Button
    private lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mapViewToId()

        handle()

    }

    @SuppressLint("SetTextI18n")
    private fun handle() {
        btnConvert.setOnClickListener { if (input.text.isNotEmpty()) {
            val result = input.text.toString().toDouble()
            tvResult.text = (result * 2.54).toString()
        }
        else {
            tvResult.text = "Please enter a number"
        } }
    }

    private fun mapViewToId(){
        input = findViewById(R.id.editTextInput)
        btnConvert = findViewById(R.id.btnClick)
        tvResult = findViewById(R.id.tvResult)
    }
}