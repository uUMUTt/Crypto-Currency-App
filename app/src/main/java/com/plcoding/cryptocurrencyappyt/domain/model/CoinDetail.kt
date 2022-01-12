package com.plcoding.cryptocurrencyappyt.domain.model

import com.plcoding.cryptocurrencyappyt.data.remote.dto_data_tranfer_object.*

data class CoinDetail(
    val coinId: String,
    val is_active: Boolean,
    val message: String,
    val description: String,
    val name: String,
    val rank: Int,
    val symbol: String,
    val tags: List<String>,//Tag > JSON object
    val team: List<TeamMember>,

    )