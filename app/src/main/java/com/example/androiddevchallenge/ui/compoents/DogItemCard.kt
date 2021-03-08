/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.compoents

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
// import androidx.compose.foundation.layout.*
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
