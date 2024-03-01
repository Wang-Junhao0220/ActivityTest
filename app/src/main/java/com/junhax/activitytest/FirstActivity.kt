package com.junhax.activitytest

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_layout)
        val exitBtn = findViewById<Button>(R.id.exit_button)

        val helloWorldBtn = findViewById<Button>(R.id.hello_world_button)
        val junhaxPage = findViewById<WebView>(R.id.junhax_page)
        junhaxPage.loadUrl("https://github.com/Wang-Junhao0220")
        helloWorldBtn.setOnClickListener {
            Toast.makeText(
                this,
                "You've just clicked the \n\"Hello, World of Android!\" Button!",
                Toast.LENGTH_LONG
            ).show()
            Thread.sleep(500)
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
        exitBtn.setOnClickListener {
            finish()
        }
        junhaxPage.webViewClient = object : WebViewClient() {
            @Deprecated("Deprecated in Java")
            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                view.loadUrl(url)
                return true
            }
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.add_item -> Toast.makeText(this, "You clicked Add", Toast.LENGTH_SHORT).show()
            R.id.remove_item -> Toast.makeText(this, "You clicked Remove", Toast.LENGTH_SHORT)
                .show()

            R.id.about -> Toast.makeText(this, "You clicked About", Toast.LENGTH_SHORT).show()
        }
        return true
    }
}