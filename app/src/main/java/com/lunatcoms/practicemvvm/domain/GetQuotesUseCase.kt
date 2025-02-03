package com.lunatcoms.practicemvvm.domain

import com.lunatcoms.practicemvvm.data.QuoteRepository
import com.lunatcoms.practicemvvm.data.model.QuoteModel
import javax.inject.Inject

class GetQuotesUseCase @Inject constructor(private val repository: QuoteRepository){

    suspend operator fun invoke():List<QuoteModel>? = repository.getAllQuotes()

}