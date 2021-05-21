package com.example.musicandroid.model

import java.util.List
import java.util.Date

data class Album (
    val album_type: String,
    val artists: List<Artist>,
    val available_markets: List<String>,
    val href: String,
    val id:String,
    val images: List<Image>,
    val name: String,
    val release_date: Date,
    val release_date_precision: String,
    val type: String,
    val uri: String
)
