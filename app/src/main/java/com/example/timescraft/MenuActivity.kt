package com.example.timescraft

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btTimesheet = findViewById<Button>(R.id.btTimesheet)
        val btCalendar = findViewById<Button>(R.id.btCalendar)
        val btTimer = findViewById<Button>(R.id.btTimer)
        val btTrackTime = findViewById<Button>(R.id.btTrackTime)
        val btEntryList = findViewById<Button>(R.id.btEntryList)

        btTimesheet.setOnClickListener {
            val intent = Intent(this, TimesheetActivity::class.java)
            startActivity(intent)
        }

        btCalendar.setOnClickListener {
            val intent = Intent(this, CalendarActivity::class.java)
            startActivity(intent)
        }

        btTimer.setOnClickListener {
            val intent = Intent(this, TimerActivity::class.java)
            startActivity(intent)
        }

        btTrackTime.setOnClickListener {
            val intent = Intent(this, TrackTimeActivity::class.java)
            startActivity(intent)
        }

        btEntryList.setOnClickListener {
            val intent = Intent(this, EntryListActivity::class.java)
            startActivity(intent)
        }
    }
}
