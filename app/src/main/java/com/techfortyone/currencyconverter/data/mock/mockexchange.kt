package com.techfortyone.currencyconverter.data.mock

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "mocktable")
data class mockexchange(
    @PrimaryKey(autoGenerate = true)
    val id : Int,
    val base: String,
    val disclaimer: String,
    val license: String,
    @Embedded
    val rates: Rates,
    val timestamp: Int
)