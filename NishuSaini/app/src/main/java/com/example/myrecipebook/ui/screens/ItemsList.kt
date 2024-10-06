package com.example.myrecipebook.ui.screens

import ItemRow
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.myrecipebook.data.getData

@Composable
fun ItemsList() {
    LazyColumn(modifier = Modifier.padding(5.dp)) {
        items(getData()){ item ->
            ItemRow(item)
        }
    }
}