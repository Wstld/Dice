package com.example.dice

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.text.isDigitsOnly

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onRollHandeler(view: View){
        val image = findViewById<ImageView>(R.id.dice)
        val input = findViewById<TextView>(R.id.numSides)
        val sides = if(input.text.isNullOrBlank()){0}else{input.text.toString().toInt()}
        if (sides in 1..6){
            //testar versioner.
            rollDice(image,sides)
        }else {input.text = "Dude! 2-6 sa jag"}
    }

    fun rollDice(view: ImageView,sides:Int){
        var image = view
        when((1..sides).random()){
            1 -> image.setImageResource(R.drawable.one)
            2 -> image.setImageResource(R.drawable.two)
            3 -> image.setImageResource(R.drawable.three)
            4 -> image.setImageResource(R.drawable.four)
            5 -> image.setImageResource(R.drawable.five)
            6 -> image.setImageResource(R.drawable.six)
        }
    }

}