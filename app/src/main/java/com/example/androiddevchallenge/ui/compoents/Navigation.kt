package com.example.androiddevchallenge.ui.compoents

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@ExperimentalFoundationApi
@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "list") {
        composable("list") {
            HomeScreen(navController)
        }

        composable("detail/{index}") {
            DogDetailScreen(
                navController,
                index = it.arguments?.getString("index")!!
            )
        }
    }
}