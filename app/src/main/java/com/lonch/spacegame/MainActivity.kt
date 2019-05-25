package com.lonch.spacegame

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get reference to button
        val btn_click_me = findViewById(R.id.imageButtonPlay) as ImageButton
        // set on-click listener
        btn_click_me.setOnClickListener {
            // your code to perform when the user clicks on the button
            Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
            val intent = Intent(this@MainActivity, KotlinInvadersActivity::class.java)
            startActivity(intent);

        }
    }
}
