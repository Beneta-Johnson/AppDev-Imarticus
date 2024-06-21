package com.example.firstkotlin

import android.content.Intent
import android.os.Bundle
import android.provider.AlarmClock
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AlarmActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_alarm)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val msg = findViewById<EditText>(R.id.alarmMsg)
        val hours = findViewById<EditText>(R.id.alarmHour)
        val mins = findViewById<EditText>(R.id.alarmMin)
        val setButton = findViewById<Button>(R.id.alarmCreate)

        setButton.setOnClickListener{
            val intent = Intent(AlarmClock.ACTION_SET_ALARM).apply {
                putExtra(AlarmClock.EXTRA_MESSAGE, msg.text.toString())
                putExtra(AlarmClock.EXTRA_HOUR, hours.text.toString().toInt())
                putExtra(AlarmClock.EXTRA_MINUTES, mins.text.toString().toInt())
            }
            startActivity(intent)
        }
    }
}