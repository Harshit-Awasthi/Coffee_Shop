package com.example.coffeestore.screens.ui_components

import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.coffeestore.R

@Preview(showBackground = true)
@Composable
fun MyBottomNavBar()
{
    // Bottom nav items
    val navItems= listOf(NavItem(title = "Home", icon = R.drawable.regular_outline_home),
            NavItem(title = "Cart", icon = R.drawable.regular_outline_bag),
        NavItem(title = "Favourites", icon = R.drawable.regular_outline_heart),
        NavItem(title = "Profile", icon = R.drawable.outline_account_circle_24)
    )

    NavigationBar(
        containerColor = MaterialTheme.colorScheme.surface,
        modifier = Modifier.height(height = 100.dp)
    ) {
        navItems.forEachIndexed { index, item ->
            NavigationBarItem()
        }
    }
}

data class NavItem(val title: String, val icon:Int)
