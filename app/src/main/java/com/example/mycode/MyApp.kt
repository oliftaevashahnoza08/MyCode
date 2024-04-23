package com.example.mycode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.widget.AppCompatButton
import android.util.Log
import android.widget.ImageView

class MyApp : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_app)


       var button=findViewById<AppCompatButton>(R.id.send)
        button.setOnClickListener{
            val intent=Intent(this@MyApp,TrAbroad::class.java)
            startActivity(intent)

        }



    }
}