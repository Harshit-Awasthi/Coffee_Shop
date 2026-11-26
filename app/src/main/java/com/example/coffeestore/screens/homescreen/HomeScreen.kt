package com.example.coffeestore.screens.homescreen

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffeestore.screens.ui_components.MyBottomNavBar

@Preview(showBackground = true)
@Composable
fun HomeScreen(){

    val location =  "63-sector, Noida"

    Scaffold(
        bottomBar = {MyBottomNavBar()
    }) {

        innerPadding ->
        Box(modifier=Modifier.fillMaxWidth().fillMaxHeight(1f/3f).background(brush= Brush.linearGradient(
            colors=listOf(Color(color = 0xFF303030),
                Color(color = 0xFF1F1F1F),
                Color(color=0xFF121212))
        )))

        Column(modifier=Modifier.fillMaxSize().padding(all=16.dp).padding(innerPadding))
        {

            Text(text="Location",color=Color.Gray, fontSize = 16.sp)
            Spacer(modifier = Modifier.height(height = 4.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text=location,
                    color = Color.White,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 14.sp)
                Icon(imageVector = Icons.Default.KeyboardArrowDown,
                    contentDescription = "Change location",
                    tint=Color.White)
            }
        }
    }

}