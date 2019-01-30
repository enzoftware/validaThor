package com.enzoftware.validathorappexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.enzoftware.validathor.ValidaThor
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // Declare validathor instance
    private lateinit var validathor : ValidaThor

    override fun onCreate(savedInstanceState: Bundle?) {
        // Initialize validathor in the app
        validathor = ValidaThor()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupUiWidgets()
    }

    private fun setupUiWidgets() {
        btn_validate.setOnClickListener {
            validateEmailField(edt_email.text.toString())
            validatePasswordField(edt_password.text.toString())
            validateCreditCardNumberField(edt_creditcard.text.toString())
        }
    }

    private fun validateEmailField(s: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private fun validatePasswordField(s: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private fun validateCreditCardNumberField(s: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
