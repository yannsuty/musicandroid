package com.example.musicandroid.API

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class CompetitionSingletonApi {
    companion object {
        val competitionApi = Retrofit.Builder()
            .baseUrl("https://api.football-data.org/v2/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CompetitionApi::class.java)
    }
}