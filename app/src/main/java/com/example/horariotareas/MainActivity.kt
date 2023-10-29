package com.example.horariotareas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.horariotareas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val turtleNames = arrayListOf<String>("leo", "raf")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.floatingActionButton.setOnClickListener {
            gotoNuevaTareaActivity()
        }

        val myAdapter = TareaAdapter(this, R.layout.tarea_listview, turtleNames)
        binding.listView.adapter = myAdapter
    }
    fun gotoNuevaTareaActivity() {
        val i = Intent(this,NuevaTareaActivity::class.java)
        startActivity(i)
    }
}

