package com.example.portfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val SkillsButton = findViewById<Button>(R.id.skillsButton)
        SkillsButton.setOnClickListener{
            intent = Intent(this,skillsActivity::class.java)
            startActivity(intent)
        }
        val educationButton = findViewById<Button>(R.id.educationButton)
        educationButton.setOnClickListener{
            intent = Intent(this,educationActivity::class.java)
            startActivity(intent)
        }
        val passionButton = findViewById<Button>(R.id.passionButton)
        passionButton.setOnClickListener {
            intent = Intent(this,passionActivity::class.java)
            startActivity(intent)
        }
        val anyButton = findViewById<Button>(R.id.anyButton)
        anyButton.setOnClickListener {
            intent=Intent(this,anyActivity::class.java)
            startActivity(intent)
        }
    }
}