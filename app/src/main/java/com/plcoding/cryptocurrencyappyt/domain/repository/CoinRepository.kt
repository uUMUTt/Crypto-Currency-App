package com.plcoding.cryptocurrencyappyt.domain.repository

import com.plcoding.cryptocurrencyappyt.data.remote.dto_data_tranfer_object.CoinDetailDto
import com.plcoding.cryptocurrencyappyt.data.remote.dto_data_tranfer_object.CoinDto

interface CoinRepository {
    suspend fun getCoins():List<CoinDto>

    suspend fun getCoinById(coinId: String):CoinDetailDto
}