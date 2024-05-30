package com.example.weatherapp.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherapp.Domains.Hourly
import com.example.weatherapp.databinding.ViewholderHourlyBinding

class HourlyAdapter(private val items:List<Hourly>) : RecyclerView.Adapter<HourlyAdapter.ViewHolder>() {
    private lateinit var context: Context
    inner class ViewHolder(val binding:ViewholderHourlyBinding) :RecyclerView.ViewHolder(binding.root){

    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HourlyAdapter.ViewHolder {
        context=parent.context
        val binding=ViewholderHourlyBinding.inflate(LayoutInflater.from(context),parent,false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int =items.size
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item= items[position]
        holder.binding.hourTxt.text=item.hour
        holder.binding.tempTxt.text= item.temp.toString()+"°C"
        val drawableResourceId=context.resources.getIdentifier(item.picPath,"drawable",context.packageName)
        holder.binding.pic.setImageResource(drawableResourceId)
    }
}