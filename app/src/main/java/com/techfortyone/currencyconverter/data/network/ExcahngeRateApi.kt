package com.techfortyone.currencyconverter.data.network

import com.techfortyone.currencyconverter.data.mock.mockexchange
import com.techfortyone.currencyconverter.data.model.CurrencyConverterDto
import com.techfortyone.currencyconverter.utils.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface ExcahngeRateApi {

    @GET("api/latest.json")
    suspend fun getExchangeRates(
        @Query("app_id") apikey : String = API_KEY
    ) : Response<mockexchange>
}