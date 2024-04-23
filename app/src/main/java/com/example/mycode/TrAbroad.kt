package com.example.mycode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatButton

class TrAbroad : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tr_abroad)



        var button=findViewById<ImageView>(R.id.back)
        button.setOnClickListener{
            val intent= Intent(this@TrAbroad,MyApp::class.java)
            startActivity(intent)
        }


    }

    }
