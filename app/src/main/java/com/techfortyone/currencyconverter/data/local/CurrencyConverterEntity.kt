package com.techfortyone.currencyconverter.data.local

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.techfortyone.currencyconverter.data.model.RatesDto

@Entity(tableName = "currency_table")
data class CurrencyConverterEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    @Embedded
    val ratesEntity: RatesEntity?,
    val timestamp: Int

)