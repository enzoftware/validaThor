package com.enzoftware.validathor

data class CardInformation (val cardIssuer: String,
                            val isValid: Boolean,
                            val error: String,
                            val cardNumber: String)