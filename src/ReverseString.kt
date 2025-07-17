package com.example.hellofreedomPlan

class ReverseString {
    fun reverseString(input: String): String{
        var reverseStr = ""

        for(letter in input.length-1 downTo 0){
            reverseStr += input[letter]
        }
        return reverseStr.lowercase()
    }

}