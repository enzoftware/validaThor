package com.enzoftware.validathorappexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.enzoftware.validathor.ValidaThor

class MainActivity : AppCompatActivity() {

    // Declare validathor instance
    private lateinit var validathor : ValidaThor

    override fun onCreate(savedInstanceState: Bundle?) {
        // Initialize validathor in the app
        validathor = ValidaThor()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
