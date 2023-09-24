package com.example.menu

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.MenuItem.OnMenuItemClickListener
import android.widget.LinearLayout
import android.widget.PopupMenu
import android.widget.Toolbar
import java.util.Objects

class popUpMenu : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pop_up_menu)
        val button=findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.Button)
        val back=findViewById<LinearLayout>(R.id.back)

        button.setOnClickListener{
            val popMenu=PopupMenu(this@popUpMenu,button)
            popMenu.menuInflater.inflate(R.menu.tools,popMenu.menu)
            popMenu.setOnMenuItemClickListener(object:PopupMenu.OnMenuItemClickListener{
                override fun onMenuItemClick(item: MenuItem?): Boolean {


                    when (item!!.itemId){
                        R.id.redColor-> back.setBackgroundColor(Color.parseColor("#FF0000"))
                        R.id.greenColor-> back.setBackgroundColor(Color.parseColor("#00FF00"))
                        R.id.blueColor-> back.setBackgroundColor(Color.parseColor("#0000FF"))

                    }
                    return true
                }

            })
            popMenu.show()
         }
    }
}