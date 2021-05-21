package com.example.musicandroid.API

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers

interface MusicApi {
    @Headers("Authorization : da6c60b2f74c4eea80fb52ddc9ddb530")

    @GET("tracks")
    fun getMusicList(): Call<TrackResponse>
}