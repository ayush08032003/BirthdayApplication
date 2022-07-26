package com.ayushwalker.birthdayapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createBirthdayCard(view: View) {
        val name = editTextPersonName.editableText.toString()
        Toast.makeText(this, "Name is $name" , Toast.LENGTH_SHORT).show()
    }
}