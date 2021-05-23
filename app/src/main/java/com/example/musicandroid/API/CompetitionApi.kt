package com.example.musicandroid.API

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface CompetitionApi {
    @GET("competitions")
    fun getCompetitionList(@Query("plan") plan: String): Call<CompetitionListResponse>
}
