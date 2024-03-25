package com.techfortyone.currencyconverter.presentation

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import com.techfortyone.currencyconverter.data.mappers.toCurrencyModel
import com.techfortyone.currencyconverter.presentation.viewmodel.ExchangeRatesViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.collectLatest

@Composable
fun CurrencyConverterScreen(viewModel: ExchangeRatesViewModel) {
    Column {
        TextField(value = "", onValueChange = {

        })
        val data = viewModel.mockexchangeRateData.value.collectAsState(initial = null)
        val res = data.value
        Log.d("TAGS", "data is ${res?.rates.toString()}")
    }
}

