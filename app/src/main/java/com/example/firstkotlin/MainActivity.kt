package com.example.firstkotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val Namebox= findViewById<EditText>(R.id.NameBox)
        val Passbox= findViewById<EditText>(R.id.PasswordBox)
        val button = findViewById<Button>(R.id.Loginbutton)
        var UserName=""
        var UserPass=""
        button.setOnClickListener{
            UserName= Namebox.text.toString()
            UserPass= Passbox.text.toString()
            if (UserName== ""){
                Toast.makeText(this@MainActivity,"The Username is empty", Toast.LENGTH_SHORT).show()
            }
            else{
                if(UserPass=="BowBowDoggy1103"){
                    val intent= Intent(this,MainActivity2::class.java)
                    intent.putExtra("Name",UserName)
                    startActivity(intent)
                }
                else{
                    Toast.makeText(this@MainActivity,"Password is incorrect", Toast.LENGTH_SHORT).show()
                }
            }
        }

    }}