package com.example.petshop

class Hungry(date: String): Mood(date) {
    override fun express(): String {
        return "My stomach is growling."
    }
}