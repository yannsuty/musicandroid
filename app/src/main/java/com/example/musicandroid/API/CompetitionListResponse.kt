package com.example.musicandroid.API

import com.example.musicandroid.model.Competition

data class CompetitionListResponse(
    val count:Int,
    val competitions:List<Competition>
)
