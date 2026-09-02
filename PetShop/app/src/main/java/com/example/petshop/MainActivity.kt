package com.example.petshop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.petshop.ui.theme.PetShopTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val cat = Cat("Bob", 3)
        val dog = Dog("Snoopy", 76)
        val scorpion = Scorpion("Stinger", 32)

        val pets = mutableListOf(cat, dog, scorpion)
        val pettablePets = mutableListOf<Pettable>(cat, dog)

        val happy = Happy("09-02-2026")
        val hungry = Hungry("09-02-2026s")

    }
}
