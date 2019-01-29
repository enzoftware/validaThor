package com.enzoftware.validathor

class CreditCardValidator {

    fun getCreditCardInformation(number: String) : CreditCardInformation{
        val creditCardInformation = CreditCardInformation(cardNumber = number)
        creditCardInformation.cardIssuer = getCreditCardIssuer(number)
        creditCardInformation.isValid = validateCreditCardNumber(number)
        creditCardInformation.error = getErrorInfo(number)
        return creditCardInformation
    }

    fun validateCreditCardNumber(number: String) : Boolean {
        return checkIfNumberContainsOnlyDigits(number)
                &&  validateLengthOfCardNumber(number)
                && (validateAndGetStartingSixDigits(number) > 0)
    }

    private fun checkIfNumberContainsOnlyDigits(number: String) : Boolean {
        return number.matches("[0-9]+".toRegex())
    }

    private fun validateLengthOfCardNumber(number: String) : Boolean {
        return number.length in 10..12
    }

    private fun getTypeOfCard(startingSixDigits: Long) : String {
        return if (startingSixDigits in 400001..499998) {
            "Visa"
        } else if ((startingSixDigits in 222101..272098) || (startingSixDigits in 510001..559998)) {
            "Mastercard"
        } else {
            "Unknown"
        }
    }

    private fun getErrorInfo(number: String) : String{
        if (!checkIfNumberContainsOnlyDigits(number)) {
            return "Number should be composed of only digits!"
        }
        if (!validateLengthOfCardNumber(number)) {
            return "Card number should be of length > 12 and < 19 digits!"
        }
        if (validateAndGetStartingSixDigits(number) == 0.toLong()) {
            return "Number contains leading zeros!";
        }
        return "NA"
    }

    private fun getCreditCardIssuer(number: String) : String{
        return getTypeOfCard(validateAndGetStartingSixDigits(number))
    }

    private fun countDigitsInNumber(num: Long) : Int{
        var count = 0
        var number = num
        while (num > 0) {
            number /= 10
            count++
        }
        return count
    }

    private fun validateAndGetStartingSixDigits(number: String) : Long{
        val startingSixDigits = number.substring(0,6)
        if (checkIfNumberContainsOnlyDigits(startingSixDigits)) {
            val startNumber : Long = startingSixDigits.toLong()
            if (startNumber == 0.toLong() || countDigitsInNumber(startNumber) < 6) {
                return 0
            }
            return startNumber
        } else {
            return 0
        }
    }
}