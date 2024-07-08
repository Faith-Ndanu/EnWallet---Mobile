package com.example.enwallet

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.enwallet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)
        binding.rvWallets.layoutManager= LinearLayoutManager(this)
            displayWallets()

        }
    fun displayWallets(){
            val wallet1=MyWallets("Abdi","KES 2000","20-10-2011")
            val wallet2=MyWallets("Kesa","KES 2345","11-12-2023")
            val wallet3=MyWallets("Kashuna"," KES 20000","12-13-2014")
            val wallet4=MyWallets("Eshe","KES 10,00","21-02-2011")
            val wallet5=MyWallets("Aziz","20,000","21-09-4567")

        val myManey= listOf(wallet1,wallet2,wallet3,wallet4,wallet5)


        val myMoney=MyMoney(myManey)
        binding.rvWallets.adapter=myMoney


        }

    }
