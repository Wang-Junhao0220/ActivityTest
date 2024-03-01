package com.junhax.activitytest

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity

class SecondActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_layout)
        val helloWorldInTheSecondActivity = findViewById<Button>(R.id.activity_2_hello_world)
        val backActivity1 = findViewById<Button>(R.id.go_back_first_activity)
        helloWorldInTheSecondActivity.setOnClickListener {
            Toast.makeText(
                this,
                "You've just clicked the Hello World button in the second activity!",
                Toast.LENGTH_LONG
            ).show()
        }
        backActivity1.setOnClickListener {
            val intent = Intent(this, FirstActivity::class.java)
            startActivity(intent)
        }
    }
}
