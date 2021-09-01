package com.example.brookcomrec

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2);

        val textView = findViewById<TextView>(R.id.textView10)

        textView.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)

            startActivity(intent)
        }


    }
}