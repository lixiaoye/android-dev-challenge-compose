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
package com.example.androiddevchallenge.data.controller

import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.bean.Dog
import com.example.androiddevchallenge.data.common.Breed

/**
 * 获取数据源的控制器
 */
object DogController {

    /**
     * 调用server端接口获取狗狗的数据
     */
    fun getDataSourceFromServer(): ArrayList<Dog> {
        return arrayListOf(
            Dog(
                id = 100001,
                name = "bc",
                gender = "Male",
                age = "5 months",
                breed = Breed.BORDER_COLLIE.value,
                photo = R.drawable.bc,
                adopted = false,
                description = "\n" +
                    "The Border Collie is a very well-proportioned, medium-sized, robust-looking dog. " +
                    "The displayed elegance and agility are commensurate with physique and energy." +
                    " Its body is solid, muscular, and has a smooth outline, giving the impression of effortless movement and infinite endurance. " +
                    "This characteristic makes it the number one shepherd dog in the world. " +
                    "It is energetic, alert and enthusiastic. " +
                    "Cleverness is a major feature of it." +
                    " The overall shape should be a very well-proportioned dog. " +
                    "The smooth outline shape shows its temperament, graceful body shape and unparalleled balance. " +
                    "Coupled with a sufficient body shape, it is guaranteed that it has the ability to maintain vitality for a long time when it is intentionally used as a shepherd dog." +
                    " Any tendency to be coarse or thin is unwelcome.\n"
            ),
            Dog(
                id = 100002,
                name = "gs",
                gender = "Male",
                age = "6 months",
                breed = Breed.GERMAN_SHEPHERD.value,
                photo = R.drawable.gs,
                adopted = false,
                description = "German Shepherd Dog (German Shepherd Dog), also known as the German black back (shell), is also known as the wolf dog. " +
                    "This dog breed is native to Germany. The only thing that can be confirmed is that the dog was fixed throughout Germany in 1880. " +
                    "Come down and use it as a shepherd dog. They are agile and suitable for action-oriented work environments, and they are often deployed for various tasks. " +
                    "He was then recruited by the German army during the First World War and served as a military dog. After being nurtured by the German army, it was basically finalized. " +
                    "Because of its tall size, mighty appearance, and strong working ability, it is active all over the world as military dogs, police dogs, search and rescue dogs, guide dogs, sheepdogs, watch dogs, and domestic pet dogs."
            ),
            Dog(
                id = 100003,
                name = "ss",
                gender = "Female",
                age = "3 months",
                breed = Breed.ROUGH_COLLIE.value,
                photo = R.drawable.ss,
                adopted = false,
                description = "The Scottish Sheepdog, also known as the Collie Sheepdog, is a type of sheepdog that originated in Scotland. " +
                    "Some dogs are loved by people for their petite and beautiful appearance, and some dogs are trusted by their owners with their empathetic aura." +
                    " The Scottish Shepherd obviously belongs to the latter. From the old animal husbandry dog to the protagonist that constantly appears in the film and television works," +
                    " its alertness, intelligence and hard work have left a deep impression on people. " +
                    "It is worthy of being called a star dog that can be with people for life."
            ),
            Dog(
                id = 100004,
                name = "gd",
                gender = "Male",
                age = "2 years",
                breed = Breed.GUIDE_DOG.value,
                photo = R.drawable.gd,
                adopted = false,
                description = "Guide dogs (colloquially known in the USA as seeing eye dogs) are assistance dogs trained to lead blind and visually impaired people around obstacles. " +
                    "Although dogs can be trained to navigate various obstacles, they are red–green color blind and incapable of interpreting street signs." +
                    " The human does the directing, based on skills acquired through previous mobility training. " +
                    "The handler might be likened to an aircraft's navigator, who must know how to get from one place to another, and the dog is the pilot, who gets them there safely. " +
                    "In several countries guide dogs, along with most other service and hearing dogs, are exempt from regulations against the presence of animals in places such as restaurants and public transportation."
            ),
            Dog(
                id = 100005,
                name = "bm",
                gender = "Female",
                age = "2 months",
                breed = Breed.POMERANIAN.value,
                photo = R.drawable.bm,
                adopted = false,
                description = "The Pomeranian is a compact, short-backed, active playing dog. Its scientific name is the Hadoli Pomeranian (commonly known as the English Pomeranian). " +
                    "It is a kind of German Fox Terrier, native to Germany. It has a soft, thick undercoat and coarse fur. " +
                    "The base of the tail is very high, and the tail with thick fur is curled on the back. It has a vigilant character, a clever expression, a brisk manner and a curious nature. " +
                    "Small and cute, suitable for companion dogs, mostly white and brown. German Fox Terriers, including the Dutch Keeshond, Large Fox Terrier, Medium Fox Terrier, Small Fox Terrier and" +
                    " Squirrel Terrier (also known as Pomeranian), are also very competitive competition dogs." +
                    " Its coat colors are white, yellowish cream, flower color, black, red, brown, etc."
            ),

        )
    }
}
