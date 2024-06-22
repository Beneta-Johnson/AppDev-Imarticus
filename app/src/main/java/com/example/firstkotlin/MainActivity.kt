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
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

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

        val items= mutableListOf<Item>()
        items.add(Item("Benjamin", "benjamin@gmail.com", R.drawable.a))
        items.add(Item("Bianca", "bianca@gmail.com", R.drawable.b))
        items.add(Item("Beneta", "beneta@yahoo.com", R.drawable.c))
        items.add(Item("Ben", "ben@gmail.com", R.drawable.d))
        items.add(Item("Bella", "bella@gmail.com", R.drawable.e))
        items.add(Item("Bob", "bob@gmail.com", R.drawable.f))
        items.add(Item("Bill", "bill@gmail.com", R.drawable.g))
        items.add(Item("Barry", "barry@gmail.com", R.drawable.h))

        items.add(Item("Benjamin", "benjamin@gmail.com", R.drawable.a))
        items.add(Item("Bianca", "bianca@gmail.com", R.drawable.b))
        items.add(Item("Beneta", "beneta@yahoo.com", R.drawable.c))
        items.add(Item("Ben", "ben@gmail.com", R.drawable.d))
        items.add(Item("Bella", "bella@gmail.com", R.drawable.e))
        items.add(Item("Bob", "bob@gmail.com", R.drawable.f))
        items.add(Item("Bill", "bill@gmail.com", R.drawable.g))
        items.add(Item("Barry", "barry@gmail.com", R.drawable.h))

        val recycler = findViewById<RecyclerView>(R.id.recycler)
        recycler.layoutManager= LinearLayoutManager(applicationContext)
        recycler.adapter= Adapter(applicationContext, items)
    }
}