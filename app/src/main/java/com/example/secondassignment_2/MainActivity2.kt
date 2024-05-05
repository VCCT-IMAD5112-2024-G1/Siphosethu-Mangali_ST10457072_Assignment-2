package com.example.secondassignment_2

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    lateinit var image: ImageView
    lateinit var feedCountTextView: TextView
    lateinit var happyCountTextView: TextView
    lateinit var cleanCountTextView: TextView
    var feedClickCount = 0
    var happyClickCount = 0
    var cleanClickCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        image = findViewById(R.id.doggo)

        feedCountTextView = findViewById(R.id.FeedCount)
        happyCountTextView = findViewById(R.id.HappyCount)
        cleanCountTextView = findViewById(R.id.CleanCount)

        val feedBtn = findViewById<Button>(R.id.FeedBtn)
        feedBtn.setOnClickListener {
           image.setImageResource(R.drawable.doggo_eating)
            feedClickCount++
            feedCountTextView.text = "$feedClickCount"
        }

        val happyBtn = findViewById<Button>(R.id.HappyBtn)
        happyBtn.setOnClickListener {
            image.setImageResource(R.drawable.puppies_clipart_10)
            happyClickCount++
            happyCountTextView.text = "$happyClickCount"
        }

        val cleanBtn = findViewById<Button>(R.id.CleanBtn)
        cleanBtn.setOnClickListener {
            image.setImageResource(R.drawable.dog_washing)
            cleanClickCount++
            cleanCountTextView.text = "$cleanClickCount"
        }
    }
}
