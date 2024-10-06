package com.example.myrecipebook.ui.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CategoryTabs() {
    var tabIndex by remember {
        mutableIntStateOf(0)
    }
    val tabs = listOf("All", "Veg", "Non Veg")
    TabRow(
        selectedTabIndex = tabIndex,
        modifier = Modifier
            .padding(10.dp),
        containerColor = Color.Gray,
        contentColor = Color.White
    )
    {
        tabs.forEachIndexed { index, title ->
            Tab(
                text = { Text(text = title) },
                selected = tabIndex == index,
                onClick = { tabIndex = index })
        }
    }
    when (tabIndex) {
        0 -> ItemsList()
        1 -> ItemsList()
        2 -> ItemsList()
    }
}