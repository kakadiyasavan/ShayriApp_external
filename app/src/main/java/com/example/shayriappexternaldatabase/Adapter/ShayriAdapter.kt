package com.example.shayriappexternaldatabase.Adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.shayriappexternaldatabase.Model.ShayriModel
import com.example.shayriappexternaldatabase.databinding.ShayriItemBinding
import kotlin.random.Random

class ShayriAdapter : RecyclerView.Adapter<ShayriAdapter.ShayriHolder>() {

    lateinit var list: List<ShayriModel>

    class ShayriHolder(itemView: ShayriItemBinding) : ViewHolder(itemView.root) {
        var binding = itemView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShayriHolder {
        var binding = ShayriItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ShayriHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ShayriHolder, position: Int) {
        holder.binding.apply {
            text.text= list.get(position).text
            val random = Random
            val color = Color.argb(150,random.nextInt(256),random.nextInt(256),random.nextInt(256))
            mainCard.setCardBackgroundColor(color)
        }
    }

    fun addShayri(list: List<ShayriModel>) {
        this.list =list
    }
}