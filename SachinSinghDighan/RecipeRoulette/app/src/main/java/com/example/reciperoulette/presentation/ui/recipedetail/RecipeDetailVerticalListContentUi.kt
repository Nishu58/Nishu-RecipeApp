package com.example.reciperoulette.presentation.ui.recipedetail

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.make_food.ui.commonui.ScreenContentText
import com.example.make_food.ui.commonui.ScreenTitleText
import com.example.reciperoulette.R

@Composable
fun CardDetailContent(
    name: String,
    modifier: Modifier = Modifier,
    content: List<String> = List(10) { "$it" }
) {

    val expanded = rememberSaveable {
        mutableStateOf(false)
    }

    Surface(
        border = BorderStroke(
            2.dp,
            MaterialTheme.colorScheme.outline
        ),
        shape = MaterialTheme.shapes.medium
    ) {

        Column {
            Row(
                modifier = Modifier
                    .padding(start = 4.dp, end = 4.dp)
                    .animateContentSize(
                        animationSpec = spring(
                            dampingRatio = Spring.DampingRatioMediumBouncy,
                            stiffness = Spring.StiffnessLow
                        )
                    )
            )
            {

                ScreenContentText(
                    text = name,
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .padding(16.dp)
                        .weight(1f)
                )

                IconButton(
                    modifier = Modifier
                        .align(Alignment.CenterVertically),
                    onClick = { expanded.value = !expanded.value }) {
                    Icon(
                        imageVector = if (expanded.value) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
                        contentDescription = if (expanded.value) stringResource(R.string.show_less) else stringResource(
                            R.string.show_more
                        )
                    )
                }
            }

            if (expanded.value) {

                Column(
                    modifier = Modifier
                        .padding(12.dp)
                ) {

                    ScreenTitleText(
                        "Ingredients",
                        modifier
                            .padding(top = 16.dp, bottom = 12.dp)
                    )

                    LazyRow(
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        modifier = modifier.padding(top = 24.dp, bottom = 12.dp)
                    ) {
                        items(content) {
                            Intgradientelement(modifier)
                        }

                    }


                    ScreenTitleText(
                        "Equipements",
                        modifier
                            .padding(top = 16.dp, bottom = 12.dp)
                    )

                    LazyRow(
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        modifier = modifier.padding(top = 24.dp, bottom = 12.dp)
                    ) {
                        items(content) {
                            Intgradientelement(modifier)
                        }

                    }

                }
            }
        }
    }
}