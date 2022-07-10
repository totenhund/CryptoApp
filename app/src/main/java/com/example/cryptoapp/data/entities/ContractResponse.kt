package com.example.cryptoapp.data.entities

import com.google.gson.annotations.SerializedName

data class ContractResponse(
    @SerializedName("contract") val contract: String,
    @SerializedName("platform") val platform: String,
    @SerializedName("type") val type: String
)