package com.techfortyone.currencyconverter.data.model

import com.google.gson.annotations.SerializedName

data class CurrencyConverterDto(
    @SerializedName("rates")
    val rates: RatesDto? = null,
    @SerializedName("timestamp")
    val timestamp: Int
)