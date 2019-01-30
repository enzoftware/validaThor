package com.enzoftware.validathorappexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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
        if (s.isEmpty()) {
            edt_email.error = "Field is empty!"
        }

        if (!validathor.isEmail(s)) {
            edt_email.error = "Invalid Email"
        } else {
            Toast.makeText(this, "Valid Email!", Toast.LENGTH_SHORT).show()
        }
    }

    private fun validatePasswordField(s: String) {
        if (s.isEmpty()) {
            edt_password.error = "Field is empty!"
        }

        if (validathor.isAtLeastLength(s, 8)
            && validathor.hasAtLeastOneDigit(s)
            && validathor.hasAtLeastOneUpperCaseCharacter(s)
            && validathor.hasAtLeastOneSpecialCharacter(s)) {
            Toast.makeText(this, "Valid Password!", Toast.LENGTH_SHORT).show()
        } else {
            edt_password.error = "Password needs to be a minimum length of 8 characters and should have at least 1 digit, 1 upppercase letter and 1 special character "
        }
    }

    private fun validateCreditCardNumberField(s: String) {
        if (s.isEmpty()) {
            edt_creditcard.error = "Field is empty!"
        }

        if (!validathor.validateCreditCard(s)) {
            edt_creditcard.error = "Invalid Credit Card number!"
        } else {
            Toast.makeText(this, "Valid Credit Card Number!", Toast.LENGTH_SHORT).show()
        }
    }
}
