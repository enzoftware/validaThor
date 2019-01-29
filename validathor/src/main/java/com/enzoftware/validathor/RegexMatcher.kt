package com.enzoftware.validathor

import java.util.regex.Pattern

open class RegexMatcher {
    fun validate(dataStr: String, regex: String): Boolean {
        if (regex.isEmpty()) {
            throw IllegalArgumentException("Regex field cannot be null or empty")
        } else {
            val pattern: Pattern = Pattern.compile(regex)
            return validate(dataStr, pattern)
        }
    }

    fun find(dataStr: String, regex: String) : Boolean {
        if (regex.isEmpty()) {
            throw IllegalArgumentException("Regex field cannot be null or empty")
        } else {
            val pattern : Pattern = Pattern.compile(regex)
            return find(dataStr, pattern)
        }
    }

    private fun validate(dataStr: String, pattern: Pattern) : Boolean {
        return !dataStr.isEmpty() && pattern.matcher(dataStr).matches()
    }



    private fun find(dataStr: String, pattern: Pattern) : Boolean {
        return !dataStr.isEmpty() && pattern.matcher(dataStr).find()
    }

}