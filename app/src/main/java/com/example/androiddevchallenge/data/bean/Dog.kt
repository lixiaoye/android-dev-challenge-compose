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
) {

}