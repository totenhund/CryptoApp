package com.example.cryptoapp.domain.respositories

import com.example.cryptoapp.domain.model.Coin
import com.example.cryptoapp.domain.model.CoinDetail

interface CoinRepository {

    suspend fun getCoins(): List<Coin>

    suspend fun getCoinById(id: String): CoinDetail

}
