package com.example.myrecipebook.ui.screens

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppTopBar() {
    TopAppBar(
        title = { Text(text = "My Recipe Book", fontSize = 30.sp, color = Color.Black) },
        actions = {
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.Filled.Search, contentDescription = "Icon", tint = Color.Black)
            }
        }
    )
}