package com.example.hellofreedomPlan

class Pangram {
    fun checkPangram(input: String): String {
        val storeInput = input.lowercase()
        val alphabetSet = mutableSetOf<Char>()
        for(char in storeInput){
            if(char in 'a'..'z'){
                alphabetSet.add(char)
            }
        }

        return if(alphabetSet.size == 26) {
            "Yes! It's a Pangram ✅"
        } else {
            "No! It's not a Pangram ❌"
        }
    }
}