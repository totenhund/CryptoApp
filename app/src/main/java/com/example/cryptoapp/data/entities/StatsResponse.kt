package com.example.cryptoapp.data.entities

import com.google.gson.annotations.SerializedName

data class StatsResponse(
    @SerializedName("contributors") val contributors: Int,
    @SerializedName("stars") val stars: Int,
    @SerializedName("subscribers") val subscribers: Int
)