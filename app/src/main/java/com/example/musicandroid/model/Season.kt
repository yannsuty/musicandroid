package com.example.musicandroid.model

import java.util.*

data class Season(
    val id: Int,
    val startDate: Date,
    val endDate: Date,
    val currentMatchday: Int,
    val winner: Team
)
