package com.enzoftware.validathor

import java.util.regex.Pattern

/**
 * The type Regex preset pattern.
 * This regex patterns come from : http://tutorials.jenkov.com/java-regex/index.html
 */
internal object RegexPresetPattern {

    /**
     * The constant ATLEAST_ONE_DIGIT.
     */
    val ATLEAST_ONE_DIGIT = Pattern.compile("[0-9]")
    /**
     * The constant ATLEAST_ONE_UPPERCASE_CHARACTER.
     */
    val ATLEAST_ONE_UPPERCASE_CHARACTER = Pattern.compile("[A-Z]")
    /**
     * The constant ATLEAST_ONE_LOWERCASE_CHARACTER.
     */
    val ATLEAST_ONE_LOWERCASE_CHARACTER = Pattern.compile("[a-z]")
    /**
     * The constant ATLEAST_ONE_LETTER.
     */
    val ATLEAST_ONE_LETTER = Pattern.compile("[a-zA-Z]")
    /**
     * The constant ATLEAST_ONE_SPECIAL_CHARACTER.
     */
    val ATLEAST_ONE_SPECIAL_CHARACTER = Pattern.compile("[^a-zA-Z0-9\\s]")
    /**
     * The constant PINCODE.
     */
    val PINCODE = Pattern.compile("^[0-9]{6}$")
    /**
     * The constant ALPHANUMERIC.
     */
    val ALPHANUMERIC = Pattern.compile("^[a-zA-Z0-9_]+$")
    /**
     * The constant NUMERIC.
     */
    val NUMERIC = Pattern.compile("^[0-9]+")
    /**
     * The constant ALPHA.
     */
    val ALPHA = Pattern.compile("[a-zA-Z]+")
    /**
     * The constant DECIMAL_NUMBER.
     */
    val DECIMAL_NUMBER = Pattern.compile("^[0-9]*\\.?[0-9]*$")
    /**
     * The constant MAC_ADDRESS.
     */
    val MAC_ADDRESS = Pattern.compile("^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$")
    /**
     * The constant HEXADECIMAL.
     */
    val HEXADECIMAL = Pattern.compile("\\p{XDigit}+")

    val MD5 = Pattern.compile("[a-fA-F0-9]{32}")

    /**
     * Matches all IPV6 and IPV4 addresses. Doesn't limit IPV4 to just values of 255. Doesn't
     * allow IPV6 compression.
     */
    val IP_ADDRESS = Pattern.compile("([0-9A-Fa-f]{1,4}:){7}[0-9A-Fa-f]{1,4}|(\\d{1,3}\\.){3}\\d{1,3}")

    /**
     * According to RFC 2821 (see http://tools.ietf.org/html/2821) and
     * RFC 2822 (see http://tools.ietf.org/html/2822), the local-part of an email addresses
     * may use any of these ASCII characters:
     * 1. Uppercase and lowercare letters
     * 2. The digits 0 through 9
     * 3. The characters, !#$%&'*+-/=?^_`{|}~
     * 4. The character "." provided that it is not the first or last character in the local-part.
     */
    val EMAIL =
        Pattern.compile("^((([!#$%&'*+\\-/=?^_`{|}~\\w])|" + "([!#$%&'*+\\-/=?^_`{|}~\\w][!#$%&'*+\\-/=?^_`{|}~\\w]*[!#$%&'*+\\-/=?^_`{|}~\\w]))[@]\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*)$")

    /**
     * Matches a hyphen separated US phone number, of the form ANN-NNN-NNNN, where A is between 2
     * and 9 and N is between 0 and 9.
     */
    val PHONE = Pattern.compile("^[2-9]\\d{2}-\\d{3}-\\d{4}$")
}
