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
package com.example.androiddevchallenge.data.bean

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

/**
 * Copyright (C), 2018-2021
 *
 * @author lixiaoye
 * @date 2021/3/2
 *
 *
 */
@Keep
data class Dog(
    @SerializedName("id")
    val id: Long,

    @SerializedName("name")
    val name: String,

    @SerializedName("gender")
    val gender: String,

    @SerializedName("age")
    val age: String,

    @SerializedName("breed")
    val breed: String,

    @SerializedName("photo")
    val photo: Int,

    @SerializedName("adopted")
    val adopted: Boolean,

    @SerializedName("description")
    val description: String
)
