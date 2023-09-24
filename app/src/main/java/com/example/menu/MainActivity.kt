package com.example.menu

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contextMenu=findViewById<ImageView>(R.id.contextmenu)
        contextMenu.setOnClickListener{
            val intent=Intent(this,ContextMenu::class.java)
            startActivity(intent)

        }
        val firstbtn=findViewById<ImageView>(R.id.firstbtn)
        firstbtn.setOnClickListener {
            val intent2=Intent(this,popUpMenu::class.java)
            startActivity(intent2)
        }
        val second=findViewById<ImageView>(R.id.second)
        second.setOnClickListener {
            val inten3=Intent(this,OptionMenu::class.java)
            startActivity(inten3)
        }
    }
}