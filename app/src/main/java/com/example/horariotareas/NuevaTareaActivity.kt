package com.example.horariotareas

import android.R
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.horariotareas.databinding.ActivityMainBinding
import com.example.horariotareas.databinding.ActivityNuevaTareaBinding

class NuevaTareaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityNuevaTareaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.floatButtonNew.setOnClickListener {
            gotoMainActivity()
        }
    }
    fun gotoMainActivity() {
        val j = Intent(this,MainActivity::class.java)
        startActivity(j)

    }
}