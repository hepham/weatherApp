package com.example.weatherapp.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherapp.Domains.FutureDomain
import com.example.weatherapp.databinding.ViewholderFutureBinding

class FutureAdapter(private val items: List<FutureDomain>):RecyclerView.Adapter<FutureAdapter.FutureViewHolder>() {
    private lateinit var context: Context
    inner class FutureViewHolder(val binding: ViewholderFutureBinding) :RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FutureViewHolder {
        context=parent.context
        val binding=ViewholderFutureBinding.inflate(LayoutInflater.from(context),parent,false)
        return FutureViewHolder(binding)
    }

    override fun getItemCount(): Int =items.size

    override fun onBindViewHolder(holder: FutureViewHolder, position: Int) {
        val item=items[position]
        holder.binding.dayTxt.text=item.day
        holder.binding.statusTxt.text=item.status
        holder.binding.highTxt.text= item.highTemp.toString()
        holder.binding.lowTxt.text=item.lowTemp.toString()
        val drawableResourceId=context.resources.getIdentifier(item.picPath,"drawable",context.packageName)
        holder.binding.pic.setImageResource(drawableResourceId)
    }
}