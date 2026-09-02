package com.example.petshop

abstract class Mood(val date: String) {
    abstract fun express(): String

    fun getDate(): String {
        return date
    }
}