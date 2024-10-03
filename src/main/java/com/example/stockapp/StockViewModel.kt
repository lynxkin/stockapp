package com.example.stockapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class StockViewModel : ViewModel() {
    private val _stockInfo = MutableLiveData<StockInfo>()
    val stockInfo: LiveData<StockInfo> = _stockInfo

    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean> = _isLoading

    private val _error = MutableLiveData<String>()
    val error: LiveData<String> = _error

    fun fetchStockInfo(symbol: String) {
        viewModelScope.launch {
            _isLoading.value = true
            try {
                // Here you would call your API service to fetch stock info
                // For now, we'll just simulate a delay and return dummy data
                kotlinx.coroutines.delay(1000)
                _stockInfo.value = StockInfo("Company $symbol", 100.0, 1.5)
            } catch (e: Exception) {
                _error.value = "Error fetching stock info: ${e.message}"
            } finally {
                _isLoading.value = false
            }
        }
    }
}

data class StockInfo(
    val companyName: String,
    val price: Double,
    val percentageChange: Double
)



