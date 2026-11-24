package com.example.coffeestore.screens.homescreen

import android.annotation.SuppressLint
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.coffeestore.screens.ui_components.MyBottomNavBar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview(showBackground = true)
@Composable
fun HomeScreen(){

    Scaffold(
        bottomBar = {MyBottomNavBar()
    }) { }

}