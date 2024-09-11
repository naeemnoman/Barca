package com.example.barca.model

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.barca.R
import com.example.barca.databinding.BarcaitemBinding

class Activity_details: AppCompatActivity() {

    private lateinit var binding: BarcaitemBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_details)

        val name=intent.getStringExtra("player")
        val position=intent.getStringExtra("postion")
        val price=intent.getStringExtra("price")
        val img=intent.getIntExtra("Img",0)
        val desc=intent.getStringExtra("Desc")

        binding.apply {

            playername.text=name
            playerpostion.text=position
            playerprice.text=price
            playerImg.setImageResource(img)

        }


    }

}