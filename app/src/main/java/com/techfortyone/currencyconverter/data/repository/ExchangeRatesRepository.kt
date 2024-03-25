package com.techfortyone.currencyconverter.data.repository

import android.util.Log
import com.techfortyone.currencyconverter.data.local.CurrencyConverterEntity
import com.techfortyone.currencyconverter.data.local.ExchangeRateDatabase
import com.techfortyone.currencyconverter.data.mappers.toEntity
import com.techfortyone.currencyconverter.data.mock.mockexchange
import com.techfortyone.currencyconverter.data.network.ExcahngeRateApi
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ExchangeRatesRepository @Inject constructor(
    private val exchangeRateApi: ExcahngeRateApi,
    private val exchangeRateDatabase: ExchangeRateDatabase
) {
    suspend fun updateExchangeRates() {
        Log.d(
            "TAGSS", "response from remote ${
                exchangeRateApi.getExchangeRates().body()
            }"
        )
        exchangeRateApi.getExchangeRates().body()?.let {
            Log.d("TAGSS", "updateExchangeRates ${it.toString()}")
            exchangeRateDatabase.getExchangeRateDao()
                .updateAllMock(it)
        }
    }

    fun getExchangeRates(): Flow<CurrencyConverterEntity> {
        return exchangeRateDatabase.getExchangeRateDao().getExchangeRates()
    }

    fun getMockExchangeRates(): Flow<mockexchange> {
        return exchangeRateDatabase.getExchangeRateDao().getExchangeRatesMock()
    }
}