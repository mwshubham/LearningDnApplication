package com.example.learningdnapplication

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

/**
 * Activities - Fragment -
 * Fragment - lightweight reusable component
 *
 * Services
 * Broadcast receivers
 *
 * Content providers - contact
 *
 * System custom
 * onCreate - Register
 * onDestroy - unregister
 */
class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val person = intent?.getParcelableExtra<Person>("key_person")!!
        Toast.makeText(this, person.name, Toast.LENGTH_SHORT).show()
    }
}