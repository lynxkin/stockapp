package com.example.stockapp

import retrofit2.http.GET
import retrofit2.http.Query

interface StockApiService {
    @GET("v8/finance/quote")
    suspend fun getStockInfo(@Query("symbols") symbol: String): StockResponse
}

data class StockResponse(
    val quoteResponse: QuoteResponse
)

data class QuoteResponse(
    val result: List<StockResult>
)

data class StockResult(
    val symbol: String,
    val longName: String,
    val regularMarketPrice: Double,
    val regularMarketChangePercent: Double
)