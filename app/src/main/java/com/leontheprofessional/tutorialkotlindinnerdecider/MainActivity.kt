package com.leontheprofessional.tutorialkotlindinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Chinese", "Hamburger", "Pizza", "McDonalds", "Barros Pizza")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener{
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            tvSelectedFood.text = foodList[randomFood]
        }

        btnAddFood.setOnClickListener {
            val newFood = tvAddFood.text.toString()
            foodList.add(newFood)
            tvAddFood.text.clear()
            println(foodList)
        }
    }
}
