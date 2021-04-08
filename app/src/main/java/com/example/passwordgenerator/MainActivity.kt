package com.example.passwordgenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val passwordgenerator=Passwordgenerator()

       bt_generate.setOnClickListener{
           val password = passwordgenerator.generatePassword(15,"jnp")
           tv_text.text=password
       }
    }
}