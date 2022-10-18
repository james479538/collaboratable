package com.jj.helloworldwithlogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var hello = findViewById<TextView>(R.id.myHelloWorld)
        hello.setText("Hello World")
    }
}