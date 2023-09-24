package com.example.menu

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView.AdapterContextMenuInfo
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast


class ContextMenu : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_context_menu)

        val listview=findViewById<ListView>(R.id.list_item)
        val array= arrayOf("Red","Blue","Green","Black","Orange","Magenta","White","Violet","Yellow",)
        val adapter=ArrayAdapter(this,R.layout.textview,array)
        listview.adapter=adapter

        registerForContextMenu(listview)
    }
    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {

        super.onCreateContextMenu(menu, v, menuInfo)
        menu!!.setHeaderTitle("Select below option")

        menu.add(0,v!!.id,0,"Item 1")
        menu.add(0,v!!.id,0,"Item 2")
        menu.add(0,v!!.id,0,"Item 3")
        menu.add(0,v!!.id,0,"Item 4")


    }

    override fun onContextItemSelected(item: MenuItem): Boolean {

         if (item!!.title=="Item 1"){
             Toast.makeText(this, "item 1 was Selected", Toast.LENGTH_SHORT).show()
         }
        else if (item!!.title=="Item 2"){
             Toast.makeText(this, "item 2 was Selected", Toast.LENGTH_SHORT).show()
         }  else if (item!!.title=="Item 3"){
             Toast.makeText(this, "item 3 was Selected", Toast.LENGTH_SHORT).show()
         }
         else {
             Toast.makeText(this, "item 4 was Selected", Toast.LENGTH_SHORT).show()
         }
         return true
     }
}