package com.example.miresiapp.models

data class ForumModel(
    val forumId: Int,
    val forumName: String,
    val createrUser: Int,
    val secondLabel: String,
    val about: String,
    val resiId: Int?,
    val cityId: Int?,
    val categoryName: String?,
    val dateCreated: String,
    val image: String?,
    val tag: String?,
    val resiName: String?,
    val cityName: String?
    )
