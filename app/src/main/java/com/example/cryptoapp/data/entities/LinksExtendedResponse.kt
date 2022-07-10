package com.example.cryptoapp.data.entities

import com.google.gson.annotations.SerializedName

data class LinksExtendedResponse(
    @SerializedName("stats") val stats: StatsResponse,
    @SerializedName("type") val type: String,
    @SerializedName("url") val url: String
)