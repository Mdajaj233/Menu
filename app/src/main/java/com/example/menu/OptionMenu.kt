package com.example.menu

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.Menu
import android.view.MenuItem
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

class OptionMenu : AppCompatActivity() {
    lateinit var back :LinearLayout

    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_option_menu)

        back = findViewById<LinearLayout>(R.id.back)
      val toolbar=findViewById<Toolbar>(R.id.tool)
        setSupportActionBar( toolbar)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.newtools, menu)
        return true
    }

  override fun onOptionsItemSelected(item:MenuItem): Boolean {
        when(item!!.itemId){
            R.id.redColors-> back.setBackgroundColor(Color.parseColor("#FF0000"))
            R.id.greenColors-> back.setBackgroundColor(Color.parseColor("#00FF00"))
            R.id.blueColors-> back.setBackgroundColor(Color.parseColor("#0000FF"))
            R.id.text -> Toast.makeText(this, "This item will be shown always on the action bar", Toast.LENGTH_SHORT).show()
        }
          return super.onOptionsItemSelected(item)
    }
}