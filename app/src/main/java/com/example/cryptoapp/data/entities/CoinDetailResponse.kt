package com.example.cryptoapp.data.entities

import com.example.cryptoapp.domain.model.CoinDetail
import com.google.gson.annotations.SerializedName

data class CoinDetailResponse(
    @SerializedName("contract") val contract: String,
    @SerializedName("contracts") val contracts: List<ContractResponse>,
    @SerializedName("description") val description: String,
    @SerializedName("development_status") val developmentStatus: String,
    @SerializedName("first_data_at") val firstDataAt: String,
    @SerializedName("hardware_wallet") val hardwareWallet: Boolean,
    @SerializedName("hash_algorithm") val hashAlgorithm: String,
    @SerializedName("id") val id: String,
    @SerializedName("is_active") val isActive: Boolean,
    @SerializedName("is_new") val isNew: Boolean,
    @SerializedName("last_data_at") val lastDataAt: String,
    @SerializedName("links") val links: LinksResponse,
    @SerializedName("links_extended") val linksExtended: List<LinksExtendedResponse>,
    @SerializedName("message") val message: String,
    @SerializedName("name") val name: String,
    @SerializedName("open_source") val openSource: Boolean,
    @SerializedName("org_structure") val orgStructure: String,
    @SerializedName("parent") val parent: ParentResponse,
    @SerializedName("platform") val platform: String,
    @SerializedName("proof_type") val proofType: String,
    @SerializedName("rank") val rank: Int,
    @SerializedName("started_at") val startedAt: String,
    @SerializedName("symbol") val symbol: String,
    @SerializedName("tags") val tags: List<TagResponse>,
    @SerializedName("team") val team: List<TeamMemberResponse>,
    @SerializedName("type") val type: String,
    @SerializedName("whitepaper") val whitepaper: WhitepaperResponse
) {
    fun toModel(): CoinDetail = CoinDetail(
        id,
        name,
        description,
        symbol,
        rank,
        isActive,
        tags.map { it.name },
        team.map { it.toModel() }
    )
}