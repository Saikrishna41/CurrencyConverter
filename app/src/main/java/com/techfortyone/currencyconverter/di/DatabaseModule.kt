package com.techfortyone.currencyconverter.di

import android.content.Context
import androidx.room.Room
import com.techfortyone.currencyconverter.data.local.ExchangeRateDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context) = Room.databaseBuilder(
        context,
        ExchangeRateDatabase::class.java,
        "exchangeRate_db"
    ).fallbackToDestructiveMigration().build()
}