package com.techfortyone.currencyconverter.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "rates_table")
data class RatesEntity(
    @PrimaryKey(autoGenerate = true)
    val rateId : Int? = null,
    val rates : Map<String, Double>
)