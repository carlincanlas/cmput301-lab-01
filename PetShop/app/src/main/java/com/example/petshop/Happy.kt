package com.example.petshop

class Happy(date: String): Mood(date) {
    override fun express(): String {
        return "I feel happy."
    }
}