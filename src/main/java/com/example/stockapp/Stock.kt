package com.example.stockapp

data class Stock(
    val symbol: String,
    val companyName: String,
    val price: Double,
    val percentageChange: Double
)