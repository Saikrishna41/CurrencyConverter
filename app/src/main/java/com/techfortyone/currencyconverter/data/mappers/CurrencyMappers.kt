package com.techfortyone.currencyconverter.data.mappers

import com.techfortyone.currencyconverter.data.domain.CurrencyConverter
import com.techfortyone.currencyconverter.data.domain.Rates
import com.techfortyone.currencyconverter.data.local.CurrencyConverterEntity
import com.techfortyone.currencyconverter.data.local.RatesEntity
import com.techfortyone.currencyconverter.data.model.CurrencyConverterDto
import com.techfortyone.currencyconverter.data.model.RatesDto


fun RatesDto.toEntity(): RatesEntity {
    return RatesEntity(
        rates = this.rates
    )
}

fun RatesEntity.toRatesModel(): Rates {
    return Rates(
        rates = this.rates
    )
}

fun CurrencyConverterDto.toEntity(): CurrencyConverterEntity {
    return CurrencyConverterEntity(
        ratesEntity = rates?.toEntity(),
        timestamp = timestamp
    )
}

fun CurrencyConverterEntity.toCurrencyModel(): CurrencyConverter {
    return CurrencyConverter(
        rates = ratesEntity?.toRatesModel(),
        timestamp = timestamp
    )
}

