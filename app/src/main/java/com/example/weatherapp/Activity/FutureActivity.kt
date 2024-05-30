package com.example.weatherapp.Activity

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.weatherapp.Adapter.FutureAdapter
import com.example.weatherapp.Adapter.HourlyAdapter
import com.example.weatherapp.Domains.FutureDomain
import com.example.weatherapp.R
import com.example.weatherapp.databinding.ActivityFutureBinding
import com.example.weatherapp.databinding.ActivityMainBinding

class FutureActivity : AppCompatActivity() {
    lateinit var binding: ActivityFutureBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityFutureBinding.inflate(layoutInflater)
        setContentView(binding.root)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
        initRecycleView()
        setVariable()
    }

    private fun setVariable() {
        val backBtn=binding.backBtn
    }

    private fun initRecycleView(){
        val items= listOf(
            FutureDomain("Sat","storm","storm",25,10),
            FutureDomain("Sun","cloudy","cloudy",24,16),
            FutureDomain("Mon","windy","windy",29,15),
            FutureDomain("Tue","cloudy_sunny","Cloudy_Sunny",22,13),
            FutureDomain("Wen","sun","Sunny",28,11),
            FutureDomain("Thus","rainy","Rainy",25,10),
            )
        binding.view2.layoutManager= LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        binding.view2.adapter= FutureAdapter(items)
    }
}