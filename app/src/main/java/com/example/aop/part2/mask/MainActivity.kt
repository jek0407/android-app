package com.example.aop.part2.mask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = findViewById<AppCompatButton>(R.id.header_user)
        val dictionary = findViewById<AppCompatButton>(R.id.header_dictionary)
        val beginnerGo = findViewById<AppCompatButton>(R.id.beginner_go)
        val intermediateGo = findViewById<AppCompatButton>(R.id.intermediate_go)
        val advancedGo = findViewById<AppCompatButton>(R.id.advanced_go)

        user.setOnClickListener{
            val intent = Intent(this, MypageActivity::class.java) //
            startActivity(intent)
        }
        dictionary.setOnClickListener{
            val intent = Intent(this, MypageActivity::class.java) //
            startActivity(intent)
        }

        beginnerGo.setOnClickListener{
            val intent = Intent(this, TestActivity::class.java) // BeginnerGo
            startActivity(intent)
            finish()
        }
        intermediateGo.setOnClickListener{
            val intent = Intent(this, TestActivity::class.java) // IntermediateGo
            startActivity(intent)
            finish()
        }
        advancedGo.setOnClickListener{
            val intent = Intent(this, TestActivity::class.java) // AdvancedGo
            startActivity(intent)
            finish()
        }
    }
}