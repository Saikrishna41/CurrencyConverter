package com.techfortyone.currencyconverter.presentation.viewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.techfortyone.currencyconverter.data.local.CurrencyConverterEntity
import com.techfortyone.currencyconverter.data.mock.mockexchange
import com.techfortyone.currencyconverter.data.repository.ExchangeRatesRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import javax.inject.Inject
import androidx.compose.runtime.remember as remember1

@HiltViewModel
class ExchangeRatesViewModel @Inject constructor(private val repository: ExchangeRatesRepository) :
    ViewModel() {
        init {
            updateExchangeRates()
        }
    var exchangeRateData: MutableState<Flow<CurrencyConverterEntity>> =
        mutableStateOf(repository.getExchangeRates())

    var mockexchangeRateData: MutableState<Flow<mockexchange>> =
        mutableStateOf(repository.getMockExchangeRates())

    fun updateExchangeRates() = viewModelScope.launch {
        repository.updateExchangeRates()
    }
}