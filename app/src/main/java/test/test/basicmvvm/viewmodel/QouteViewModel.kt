package test.test.basicmvvm.viewmodel

import androidx.lifecycle.ViewModel
import test.test.basicmvvm.model.Quote
import test.test.basicmvvm.repository.QuoteRepository

class QouteViewModel(private val quoteRepository: QuoteRepository) : ViewModel() {

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)

}