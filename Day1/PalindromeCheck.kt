package com.example.hellofreedomPlan

class PalindromeCheck {
    fun checkPalindrome(input: String): String{
        val storeInput = input.lowercase()
        val reverseStringObj = ReverseString()
        val reverseString = reverseStringObj.reverseString(storeInput)

        return if(storeInput == reverseString) {
            "✅ Yes '$storeInput = $reverseString' -> it is a Palindrome"
        } else {
            "❌ No '$storeInput =! $reverseString' -> it is not a Palindrome"
        }
    }
}