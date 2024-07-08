package com.example.enwallet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyMoney (var walletsList: List<MyWallets>): RecyclerView.Adapter<WalletsViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WalletsViewHolder {
            val itemView= LayoutInflater.from(parent.context).inflate(R.layout.activity_second,parent,false)
            return WalletsViewHolder(itemView)
        }

        override fun onBindViewHolder(holder: WalletsViewHolder, position: Int) {
            val contact=walletsList[position]
            holder.tvSalary.text=contact.salary
            holder.tvDate.text=contact.date
            holder.tvMoney.text=contact.money


        }


        override fun getItemCount(): Int {
            return walletsList.size

        }
    }
    class WalletsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var tvSalary=itemView.findViewById<TextView>(R.id.tvSalary)
        var tvDate=itemView.findViewById<TextView>(R.id.tvDate)
        var tvMoney=itemView.findViewById<TextView>(R.id.tvMoney)
    }
