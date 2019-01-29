package com.enzoftware.validathor

import android.graphics.Color
import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject
import java.lang.IllegalArgumentException
import java.util.regex.Pattern

class ValidaThor {

    private var regexMatcher: RegexMatcher = RegexMatcher()
    private var creditCardValidator: CreditCardValidator = CreditCardValidator()

    fun isAlpha(str: String) = regexMatcher.validate(str, RegexPresetPattern.ALPHA)
    fun isAlphaNumeric(str: String) = regexMatcher.validate(str, RegexPresetPattern.ALPHANUMERIC)
    fun isBoolean(str: String) = str.toLowerCase() == "true" || str.toLowerCase() == "false"
    fun isIPAddress(str: String) = regexMatcher.validate(str, RegexPresetPattern.IP_ADDRESS)
    fun isPhoneNumber(str: String) = regexMatcher.validate(str, RegexPresetPattern.PHONE)
    fun isEmail(str: String) = regexMatcher.validate(str, RegexPresetPattern.EMAIL)
    fun isPinCode(str: String) = regexMatcher.validate(str, RegexPresetPattern.PINCODE)
    fun isHexadecimal(str: String) = regexMatcher.validate(str, RegexPresetPattern.HEXADECIMAL)
    fun isMACAddress(str: String) = regexMatcher.validate(str, RegexPresetPattern.MAC_ADDRESS)
    fun isValidMD5(str: String) = regexMatcher.validate(str, RegexPresetPattern.MD5)
    fun isNumeric(str: String) = regexMatcher.validate(str, RegexPresetPattern.NUMERIC)
    fun isDecimal(str: String) = regexMatcher.validate(str, RegexPresetPattern.DECIMAL_NUMBER)
    fun containsSubString(str: String, seed: String) = Pattern.compile(Pattern.quote(seed), Pattern.CASE_INSENSITIVE).matcher(str).find()
    fun isAtLeastLength(str: String, length: Int) = str.length >= length
    fun isAtMostLength(str: String, length: Int) = str.length <= length
    fun isLowerCase(str: String) = str == str.toLowerCase()
    fun isUpperCase(str: String) = str == str.toUpperCase()
    fun isJson(str: String) : Boolean {
        try {
            JSONObject(str)
        } catch (e: JSONException) {
            try {
                JSONArray(str)
            } catch (e : JSONException) {
                return false
            }
            return false
        }
        return true
    }
    fun isHexColor(str: String) : Boolean {
        return try {
            Color.parseColor(str)
            true
        } catch (e : IllegalArgumentException) {
            false
        }
    }
    fun isBase64(str: String) : Boolean {
        return try {
            android.util.Base64.decode(str, android.util.Base64.DEFAULT)
            true
        } catch (e : IllegalArgumentException){
            false
        }
    }

    fun hasAtLeastOneDigit(str: String) = regexMatcher.find(str, RegexPresetPattern.ATLEAST_ONE_DIGIT)
    fun hasAtLeastOneLetter(str: String) = regexMatcher.find(str, RegexPresetPattern.ATLEAST_ONE_LETTER)
    fun hasAtLeastOneLowerCaseCharacter(str: String) = regexMatcher.find(str, RegexPresetPattern.ATLEAST_ONE_LOWERCASE_CHARACTER)
    fun hasAtLeastOneUpperCaseCharacter(str: String) = regexMatcher.find(str, RegexPresetPattern.ATLEAST_ONE_UPPERCASE_CHARACTER)
    fun hasAtLeastOneSpecialCharacter(str: String) = regexMatcher.find(str, RegexPresetPattern.ATLEAST_ONE_SPECIAL_CHARACTER)


    fun validateCreditCard(str: String) = creditCardValidator.validateCreditCardNumber(str)
    fun getCreditCardInformation(str: String) = creditCardValidator.getCreditCardInformation(str)

}