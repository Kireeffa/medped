package com.example.rozalotus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class VxodActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vxod)
        val bt: Button = findViewById(R.id.button2)
        val txt: TextView = findViewById(R.id.editTextTextEmailAddress)
        val psw: TextView = findViewById(R.id.editTextTextPassword)
        bt.setOnClickListener {
            if (txt.text.isNotEmpty() && psw.text.isNotEmpty())
            {
                val intent = Intent(this, TabloActivity::class.java)
                startActivity(intent)
            }
            else{
                Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show()
            }
        }
    }
}


