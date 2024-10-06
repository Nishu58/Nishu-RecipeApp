package com.example.myrecipebook

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.myrecipebook.ui.screens.AppTopBar
import com.example.myrecipebook.ui.screens.CategoryTabs
import com.example.myrecipebook.ui.screens.RecipeOfTheDay
import com.example.myrecipebook.ui.theme.MyRecipeBookTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyRecipeBookTheme {
                App()
            }
        }
    }

    @Composable
    fun App() {
        Column {
            AppTopBar()
            RecipeOfTheDay()
            //CategoryCard()
            CategoryTabs()
        }
    }

    @Preview(showBackground = true, showSystemUi = true)
    @Composable
    fun GreetingPreview() {
        MyRecipeBookTheme {
            App()
        }
    }
}