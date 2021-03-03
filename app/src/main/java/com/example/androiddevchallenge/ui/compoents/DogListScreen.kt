package com.example.androiddevchallenge.ui.compoents

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.androiddevchallenge.data.bean.Dog
import java.util.ArrayList

@ExperimentalFoundationApi
@Composable
fun DogListScreen(navController: NavHostController, dogs: ArrayList<Dog>) {
    Surface {
        Column {
            LazyVerticalGrid(
                cells = GridCells.Fixed(1),
                contentPadding = PaddingValues(16.dp),
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                itemsIndexed(dogs) { index, dog ->
                    DogItemCard(navController = navController, index = index, dog = dog)
                }
            }
        }
    }
}