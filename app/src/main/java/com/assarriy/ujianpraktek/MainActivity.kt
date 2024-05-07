package com.assarriy.ujianpraktek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.assarriy.ujianpraktek.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        val name = intent.getStringExtra("EXTRA_NAME")

        val textView = findViewById<TextView>(R.id.txt_name).apply {
            text = name
        }
    }
}