package com.example.musicandroid.model

import java.util.Date

data class Competition(
    val id: Int,
    val area: Area,
    val name: String,
    val code: String,
    val emblemUrl: String,
    val plan: String,
    val currentSeason: Season,
    val numberOfAvailableSeasons: Int,
    val lastUpdated: Date
) {
    override fun toString(): String {
        return name
    }
}
