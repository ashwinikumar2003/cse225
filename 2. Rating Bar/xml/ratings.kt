package com.example.scrollview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast

class ratings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ratings)
        val RatingBar1 = findViewById<RatingBar>(R.id.RatingBar1)
        val submitBtn = findViewById<Button>(R.id.submitBtn)
        val RatingBar2 = findViewById<RatingBar>(R.id.ratingBar2)

        submitBtn.setOnClickListener{
            val totalStars="Total Stars: "+RatingBar1.numStars
            val rating="Rating: "+RatingBar1.rating
            Toast.makeText(this, """$totalStars$rating""".trimIndent(), Toast.LENGTH_LONG).show()
        }

        RatingBar2.setOnRatingBarChangeListener { ratingBar, rating, fromUser ->
            Toast.makeText(this, "rating $rating, $fromUser", Toast.LENGTH_LONG).show()
        }
    }
}