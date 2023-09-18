package com.example.multipleactivity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button1 =  findViewById<Button>(R.id.button1)
        button1.setOnClickListener{
            val intent1 = Intent (this, Page2::class.java)
            startActivity(intent1)
        }
        var button4 =  findViewById<Button>(R.id.button4)
        button4.setOnClickListener{
            val intent1 = Intent (this, Page3::class.java)
            startActivity(intent1)
        }

    }
}