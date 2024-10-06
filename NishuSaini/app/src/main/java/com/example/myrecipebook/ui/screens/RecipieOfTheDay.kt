package com.example.myrecipebook.ui.screens

import ItemRow
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myrecipebook.data.getTodayRecipe

@Composable
fun RecipeOfTheDay() {
    Column {
        Text(text = "Recipe of the day", fontSize = 30.sp, color = Color.Blue,
            modifier = Modifier.absolutePadding(left = 10.dp))
        ItemRow(getTodayRecipe())
    }
}