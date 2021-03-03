package com.example.androiddevchallenge.ui.compoents

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate
import androidx.navigation.compose.popUpTo
import com.example.androiddevchallenge.data.bean.Dog


@Composable
fun DogItemCard(navController: NavHostController, index: Int, dog: Dog) {
    Card(
        elevation = 5.dp,
        shape = RoundedCornerShape(12.dp),
        modifier = Modifier
            .clickable {
                navController.navigate("detail/$index") {
                }
            }
            .padding(16.dp),

        ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.padding(top = 4.dp)
        ) {
            Image(
                painter = painterResource(id = dog.photo),
                contentDescription = "",
                Modifier.size(100.dp, 150.dp),
                contentScale = ContentScale.FillHeight
            )
            Column(
                verticalArrangement = Arrangement.Center
            ) {
                Row(modifier = Modifier.padding(3.dp)) {
                    Text(text = "Name: ", fontWeight = FontWeight.Bold)
                    Text(text = dog.name)
                }
                Row(modifier = Modifier.padding(3.dp)) {
                    Text(text = "Age: ", fontWeight = FontWeight.Bold)
                    Text(text = dog.age)
                }
                Row(modifier = Modifier.padding(3.dp)) {
                    Text(text = "Breed: ", fontWeight = FontWeight.Bold)
                    Text(text = dog.breed)
                }
                Row(modifier = Modifier.padding(3.dp)) {
                    Text(text = "Adopted: ", fontWeight = FontWeight.Bold)
                    Text(text = " ${dog.adopted}")
                }
            }
        }
    }
}