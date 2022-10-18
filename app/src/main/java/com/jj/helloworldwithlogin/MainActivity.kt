package com.jj.helloworldwithlogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var email = "test@email.com"
        var password = "test"
//
        var useremail = findViewById<EditText>(R.id.userEmail)
        var userpassword = findViewById<EditText>(R.id.userPassword)
        var submitButton = findViewById<Button>(R.id.submitButton)
        var userText = findViewById<TextView>(R.id.myTextView)
        useremail.setText("")
        userpassword.setText("")
        userText.setText("TEst");

        submitButton.setOnClickListener {
            if(useremail.text.toString() == email && userpassword.text.toString() == password){
                this.setContentView(R.layout.activity_main2)
            }
        }
    }
}