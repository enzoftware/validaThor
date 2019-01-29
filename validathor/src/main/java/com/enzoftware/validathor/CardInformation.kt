package com.enzoftware.validathor

data class CreditCardInformation (
    var cardIssuer: String? = "",
    var isValid: Boolean? = false,
    var error: String? = "",
    val cardNumber: String)