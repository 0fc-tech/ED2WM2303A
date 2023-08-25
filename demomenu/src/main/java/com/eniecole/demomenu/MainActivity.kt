package com.eniecole.demomenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main_activity,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.itemAdd-> Toast.makeText(this, "AJOUTER", Toast.LENGTH_SHORT).show()
            R.id.itemConfig-> Toast.makeText(this, "CONFIG", Toast.LENGTH_SHORT).show()
            R.id.itemEdit-> Toast.makeText(this, "EDIT", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}