package com.example.hellofreedomDay1

fun main() {

    val anagramObj = Anagram()
    print("Enter first word: ")
    val input1 = getInput()
    print("Enter second word: ")
    val input2 = getInput()
    val result = anagramObj.checkAnagram(input1, input2)
    if(result) {
        println("✅ Yes! These are Anagrams.")
    } else {
        println("❌ No! These are not Anagrams.")
    }


    /*
    val pangramObj = Pangram()
    val input = getInput()
    val result = pangramObj.checkPangram(input)
    println(result)
    */

    /*
    val palindromeCheckObj = PalindromeCheck()
    val input = getInput()
    val result = palindromeCheckObj.checkPalindrome(input)
    println(result)
    */

    /*
    val reverseObj = ReverseString()
    val input = getInput()
    val reverseString = reverseObj.reverseString(input)
    print("reverse string is... ${reverseString.lowercase()}")
    */

}

fun getInput(): String {
    val input = readLine()?: ""
    return input
}
