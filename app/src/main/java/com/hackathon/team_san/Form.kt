package com.hackathon.team_san

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Form:AppCompatActivity() {
    lateinit var Next:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.form)
            supportActionBar?.title = "Register Yourself"
            supportActionBar?.setHomeButtonEnabled(true)
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
Next=findViewById(R.id.btnNext)
        Next.setOnClickListener {
            var i= Intent(this@Form,Form_next::class.java)
            startActivity(i)
        }
    }
}