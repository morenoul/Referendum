package com.example.referendum

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var si = findViewById<CheckBox>(R.id.si)
        var no = findViewById<CheckBox>(R.id.no)
        var votarBoton = findViewById<Button>(R.id.votar)

        si.setOnClickListener(){
            no.isChecked = false
        }
        no.setOnClickListener(){
            si.isChecked = false
        }
        votarBoton.setOnClickListener {
            if (si.isChecked && no.isChecked) {
                println("No has votado")
            }else{
                if (no.isChecked){
                    println("Has votado no")
                }else{
                    println("Has votado si")
                }
                votarBoton.isEnabled = false
            }

        }

    }

}