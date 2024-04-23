package com.example.secondassignment_2

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    lateinit var image: ImageView
    lateinit var feedCountTextView: TextView
    lateinit var playCountTextView: TextView
    lateinit var cleanCountTextView: TextView
    private var feedClickCount: Int = 0
    private var playClickCount: Int = 0
    private var cleanClickCount: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        image = findViewById(R.id.doggo)


        feedCountTextView = findViewById(R.id.FeedCount)

        val FeedBtn = findViewById<Button>(R.id.FeedBtn)
        FeedBtn.setOnClickListener {

            image.setImageResource(R.drawable.doggo_eating)

            feedClickCount++
            feedCountTextView.text = "Feed Count: $feedClickCount"
        }

        playCountTextView = findViewById(R.id.PlayCount)


        val PlayBtn = findViewById<Button>(R.id.PlayBtn)
        PlayBtn.setOnClickListener {

            image.setImageResource(R.drawable.puppies_clipart_10)

            playClickCount++
            playCountTextView.text = "Play Count: $playClickCount"
        }

        cleanCountTextView = findViewById(R.id.CleanCount)


        //when the button is clicked it changes to the clean image
        val CleanBtn = findViewById<Button>(R.id.CleanBtn)
        CleanBtn.setOnClickListener {

            // Change the image resource when the Clean button is clicked
            image.setImageResource(R.drawable.dog_washing)

            //counting the clicks of the dog button
            cleanClickCount++
            cleanCountTextView.text = "Clean Count: $cleanClickCount"

        }
    }
}