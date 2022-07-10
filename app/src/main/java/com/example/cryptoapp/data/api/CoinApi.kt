package com.example.cryptoapp.data.api

import com.example.cryptoapp.data.entities.CoinDetailResponse
import com.example.cryptoapp.data.entities.CoinResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinApi {

    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinResponse>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoinById(@Path("coinId") coinId: String): CoinDetailResponse

}