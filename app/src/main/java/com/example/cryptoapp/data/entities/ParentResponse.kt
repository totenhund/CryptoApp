package com.example.cryptoapp.data.entities

import com.google.gson.annotations.SerializedName

data class ParentResponse(
    @SerializedName("id") val id: String,
    @SerializedName("name") val name: String,
    @SerializedName("symbol") val symbol: String
)