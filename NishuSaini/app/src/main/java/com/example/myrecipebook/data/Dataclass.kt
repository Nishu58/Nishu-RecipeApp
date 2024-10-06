package com.example.myrecipebook.data

import com.example.myrecipebook.R

val list = mutableListOf<RecipeData>()
fun getData(): MutableList<RecipeData> {
    list.add(
        RecipeData(
            "Recipe one",
            "5.00 mins",
            "This is very easy to cook recipe.",
            R.drawable.ic_launcher_background
        )
    )
    list.add(
        RecipeData(
            "Recipe two",
            "3.00 mins",
            "This is very easy to cook recipe.",
            R.drawable.ic_launcher_background
        )
    )
    list.add(
        RecipeData(
            "Recipe three",
            "8.00 mins",
            "This is very easy to cook recipe.",
            R.drawable.ic_launcher_background
        )
    )
    list.add(
        RecipeData(
            "Recipe four",
            "5.00 mins",
            "This is very easy to cook recipe.",
            R.drawable.ic_launcher_background
        )
    )
    list.add(
        RecipeData(
            "Recipe five",
            "7.60 mins",
            "This is very easy to cook recipe.",
            R.drawable.ic_launcher_background
        )
    )
    list.add(
        RecipeData(
            "Recipe six",
            "6.00 mins",
            "This is very easy to cook recipe.",
            R.drawable.ic_launcher_background
        )
    )
    list.add(
        RecipeData(
            "Recipe seven",
            "5.00 mins",
            "This is very easy to cook recipe.",
            R.drawable.ic_launcher_background
        )
    )
    list.add(
        RecipeData(
            "Recipe eight",
            "2.00 mins",
            "This is very easy to cook recipe.",
            R.drawable.ic_launcher_background
        )
    )
    list.add(
        RecipeData(
            "Recipe nine",
            "8.00 mins",
            "This is very easy to cook recipe.",
            R.drawable.ic_launcher_background
        )
    )
    list.add(
        RecipeData(
            "Recipe ten",
            "5.00 mins",
            "This is very easy to cook recipe.",
            R.drawable.ic_launcher_background
        )
    )
    return list
}

fun getTodayRecipe(): RecipeData {
    return RecipeData(
        "Recipe of the day",
        "5.00 mins",
        "This is very easy to cook recipe. Easy to cook, easy to serve. Just wow",
        R.drawable.ic_launcher_background
    )
}

