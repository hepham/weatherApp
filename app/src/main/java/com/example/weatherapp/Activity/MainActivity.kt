package com.example.weatherapp.Activity

import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.weatherapp.Adapter.HourlyAdapter
import com.example.weatherapp.Domains.Hourly
import com.example.weatherapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecycleView()
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
    }

    private fun initRecycleView() {
        val items= listOf(
            Hourly("9 pm",28,"cloudy"),
            Hourly("11 pm",29,"sunny"),
            Hourly("12 pm",30,"wind"),
            Hourly("1 am",29,"rainy"),
            Hourly("2 pm",26,"storm"),
            Hourly("3 pm",25,"cloudy")
        )
        binding.view1.layoutManager= LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        binding.view1.adapter= HourlyAdapter(items)

    }
}