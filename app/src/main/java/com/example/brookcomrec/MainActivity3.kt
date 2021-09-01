package com.example.brookcomrec

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val textView = findViewById<TextView>(R.id.textView13)

        textView.setOnClickListener {
            val intent = Intent(this, MainActivity6::class.java)

            startActivity(intent)
        }


    }
}