package com.example.androiddevchallenge.ui.compoents

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.androiddevchallenge.data.controller.DogController


@ExperimentalFoundationApi
@Composable
fun HomeScreen(navController: NavHostController) {
    Scaffold(
        drawerContent = { /*...*/ },
        topBar = {
            TopAppBar()
        },
        content = {
            val dogs = DogController.getDataSourceFromServer()
            DogListScreen(navController = navController, dogs = dogs)
        }
    )
}

@Composable
fun TopAppBar() {
    androidx.compose.material.TopAppBar(
        title = { Text("Puppy Adoption") },
        navigationIcon = {
            IconButton(onClick = { }) {
                Icon(Icons.Filled.ArrowBack, "back")
            }
        },
        actions = {
            IconButton(onClick = { }) {
                Icon(Icons.Filled.Share, "share")
            }
        }
    )
}