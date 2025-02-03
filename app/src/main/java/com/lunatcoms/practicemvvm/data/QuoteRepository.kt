package com.lunatcoms.practicemvvm.data

import com.lunatcoms.practicemvvm.data.model.QuoteModel
import com.lunatcoms.practicemvvm.data.model.QuoteProvider
import com.lunatcoms.practicemvvm.data.network.QuoteApiClient
import com.lunatcoms.practicemvvm.data.network.QuoteService
import javax.inject.Inject

class QuoteRepository @Inject constructor(
    private val api: QuoteService,
    private val quoteProvider: QuoteProvider
) {

    suspend fun getAllQuotes(): List<QuoteModel> {
        val response = api.getQuotes()
        quoteProvider.quotes = response
        return response
    }
}