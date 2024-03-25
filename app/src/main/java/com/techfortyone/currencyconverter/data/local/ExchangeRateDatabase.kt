package com.techfortyone.currencyconverter.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters

@Database(entities = [CurrencyConverterEntity::class, RatesEntity::class], exportSchema = false, version = 2)
@TypeConverters(Converters::class)
abstract class ExchangeRateDatabase : RoomDatabase() {

    abstract fun getExchangeRateDao() : CurrencyConverterDao
}