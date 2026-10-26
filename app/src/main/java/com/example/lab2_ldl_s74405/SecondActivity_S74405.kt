package com.example.lab2_ldl_s74405

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity_S74405 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second_s74405)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val tvName = findViewById<TextView>(R.id.tvDisplayName)
        val tvAge = findViewById<TextView>(R.id.tvDisplayAge)

        val dataName = intent.getStringExtra("EXTRA_NAME") ?: "Name Empty"
        val dataAge = intent.getStringExtra("EXTRA_AGE") ?: "No Age Input"

        tvName.text = "Name $dataName"
        tvAge.text = "Age $dataAge."
    }
}