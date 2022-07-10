package com.example.cryptoapp.data.repositories

import com.example.cryptoapp.data.api.CoinApi
import com.example.cryptoapp.domain.model.Coin
import com.example.cryptoapp.domain.model.CoinDetail
import com.example.cryptoapp.domain.respositories.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val coinApi: CoinApi
) : CoinRepository {


    override suspend fun getCoins(): List<Coin> = coinApi.getCoins().map { it.toModel() }

    override suspend fun getCoinById(id: String): CoinDetail = coinApi.getCoinById(id).toModel()

}