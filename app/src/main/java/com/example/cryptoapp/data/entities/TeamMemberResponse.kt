package com.example.cryptoapp.data.entities

import com.example.cryptoapp.domain.model.CoinDetail
import com.google.gson.annotations.SerializedName

data class TeamMemberResponse(
    @SerializedName("id") val id: String,
    @SerializedName("name") val name: String,
    @SerializedName("position") val position: String
) {
    fun toModel() = CoinDetail.TeamMember(
        id, name, position
    )
}