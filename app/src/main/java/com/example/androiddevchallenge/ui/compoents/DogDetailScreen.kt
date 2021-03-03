package com.example.androiddevchallenge.ui.compoents

import android.util.Log
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.androiddevchallenge.data.controller.DogController

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun DogDetailScreen(navController: NavHostController, index: Int) {
    val dog = DogController.getDataSourceFromServer()[index]
    Log.e("lixiaoye", "DogDetailScreen index=$index")
    Surface(color = Color.White, modifier = Modifier.fillMaxHeight()) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
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

            Text(text = "Details ", fontWeight = FontWeight.Bold)
            Text(text = dog.description, modifier = Modifier.padding(horizontal = 16.dp))
            Button(
                enabled = !dog.adopted,
                onClick = {
                    /**
                     * todo
                     */
                },
                shape = MaterialTheme.shapes.medium,
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
            ) {
                Text("Apply for Adoption", modifier = Modifier.padding(10.dp))
            }
        }
    }
}
