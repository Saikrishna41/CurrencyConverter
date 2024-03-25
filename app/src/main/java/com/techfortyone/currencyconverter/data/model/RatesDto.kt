package com.techfortyone.currencyconverter.data.model

import com.google.gson.annotations.SerializedName

data class RatesDto(
  val rates :  Map<String, Double>
)