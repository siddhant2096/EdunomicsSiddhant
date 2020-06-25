package com.example.edunomics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.edunomics.R.id.loginbutton

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        val gobutton= findViewById<Button>(R.id.loginbutton)
        gobutton.setOnClickListener {
            //  Toast.makeText(context,"hello",Toast.LENGTH_LONG).show()
            val intent = Intent(this, ChatActivity::class.java)
            startActivity(intent,Bundle())
        }}
    }

