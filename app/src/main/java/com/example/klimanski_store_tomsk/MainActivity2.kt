package com.example.klimanski_store_tomsk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val button: Button = findViewById(R.id.button)

        button.setOnClickListener {
            intent = Intent(this,MainActivity3::class.java)
            startActivity(intent)
        }
    }
}