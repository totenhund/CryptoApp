package com.example.cryptoapp.data.entities

import com.google.gson.annotations.SerializedName

data class TagResponse(
    @SerializedName("coin_counter") val coinCounter: Int,
    @SerializedName("ico_counter") val icoCounter: Int,
    @SerializedName("id") val id: String,
    @SerializedName("name") val name: String
)