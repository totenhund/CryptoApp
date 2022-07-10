package com.example.cryptoapp.data.entities

import com.google.gson.annotations.SerializedName

data class WhitepaperResponse(
    @SerializedName("link") val link: String,
    @SerializedName("thumbnail") val thumbnail: String
)