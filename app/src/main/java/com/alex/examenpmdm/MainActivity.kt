package com.alex.examenpmdm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.segundo_activity)
        val inicio: Button = findViewById(R.id.button)

        for(i in 100 downTo 0){
            Log.d("color", i.toString())
        }
        inicio.setOnClickListener(){
            Toast.makeText(this, "Boton", Toast.LENGTH_SHORT).show()
        }
    }
}