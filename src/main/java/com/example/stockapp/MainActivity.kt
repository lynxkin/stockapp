package com.example.stockapp

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.stockapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: StockViewModel
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Initialize ViewModel
        viewModel = ViewModelProvider(this)[StockViewModel::class.java]

        // Set click listener for search button
        binding.searchButton.setOnClickListener {
            val symbol = binding.searchEditText.text.toString().trim()
            if (symbol.isNotEmpty()) {
                viewModel.fetchStockInfo(symbol)
            } else {
                Toast.makeText(this, "Please enter a stock symbol", Toast.LENGTH_SHORT).show()
            }
        }

        observeViewModel()
    }

    private fun observeViewModel() {
        viewModel.stockInfo.observe(this) { stock ->
            binding.companyNameTextView.text = stock.companyName
            binding.stockPriceTextView.text = "Price: $${String.format("%.2f", stock.price)}"
            binding.percentageChangeTextView.text = "Change: ${String.format("%.2f", stock.percentageChange)}%"
        }

        viewModel.isLoading.observe(this) { isLoading ->
            binding.loadingProgressBar.visibility = if (isLoading) View.VISIBLE else View.GONE
        }

        viewModel.error.observe(this) { errorMsg ->
            Toast.makeText(this, errorMsg, Toast.LENGTH_LONG).show()
        }
    }
}