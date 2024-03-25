package com.techfortyone.currencyconverter.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import com.techfortyone.currencyconverter.data.domain.CurrencyConverter
import com.techfortyone.currencyconverter.data.mock.mockexchange
import kotlinx.coroutines.flow.Flow
import retrofit2.http.DELETE


@Dao
interface CurrencyConverterDao {

    @Upsert
    suspend fun updateAll(currencyConverter: CurrencyConverterEntity)

    @Upsert
    suspend fun updateAllMock(currencyConverter: mockexchange)

    @Query("SELECT * FROM currency_table")
    fun getExchangeRates() : Flow<CurrencyConverterEntity>

    @Query("SELECT * FROM mocktable")
    fun getExchangeRatesMock() : Flow<mockexchange>

    @Query("DELETE FROM currency_table")
    suspend fun clearAll()

}