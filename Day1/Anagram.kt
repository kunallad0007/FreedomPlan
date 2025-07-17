package com.example.hellofreedomDay1

class Anagram {
    fun checkAnagram(str1: String, str2: String): Boolean {
        val cleanStr1 = str1.lowercase().replace(" ", "")
        val cleanStr2 = str2.lowercase().replace(" ", "")

        return cleanStr1.toCharArray().sorted() == cleanStr2.toCharArray().sorted()
    }
}