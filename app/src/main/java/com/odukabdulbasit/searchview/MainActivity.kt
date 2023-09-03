package com.odukabdulbasit.searchview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SearchView

class MainActivity : AppCompatActivity() {
    private lateinit var searchView: SearchView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        searchView = findViewById(R.id.searchView)

        // Configure the SearchView
        searchView.setIconifiedByDefault(false)
        searchView.queryHint = "Search..."

        // Set a query text listener to handle search queries
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                // Handle the submitted query (perform search)
                if (!query.isNullOrBlank()) {
                    performSearch(query)
                }
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                // Handle query text changes (filter results, etc.)
                return true
            }
        })
    }

    private fun performSearch(query: String) {
        // Implement your search logic here
        // You can use this query to filter a list or perform a network request
        // Update your UI with the search results
    }
}
