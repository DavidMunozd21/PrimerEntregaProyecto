package com.example.horariotareas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.horariotareas.databinding.ActivityMainBinding

class VerTareaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}