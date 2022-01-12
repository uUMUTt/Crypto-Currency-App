package com.plcoding.cryptocurrencyappyt.data.remote

import com.plcoding.cryptocurrencyappyt.data.remote.dto_data_tranfer_object.CoinDetailDto
import com.plcoding.cryptocurrencyappyt.data.remote.dto_data_tranfer_object.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaApi {
    @GET("/v1/coins")
    suspend fun getCoins():List<CoinDto>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoinById(@Path("coinId") coinId:String):CoinDetailDto
}