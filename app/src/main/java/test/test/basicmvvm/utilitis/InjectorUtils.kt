package test.test.basicmvvm.utilitis

import test.test.basicmvvm.data.FakeDatabase
import test.test.basicmvvm.repository.QuoteRepository
import test.test.basicmvvm.viewmodel.QouteViewModelFactory

object InjectorUtils {

    fun provideQuotesViewModelFactory(): QouteViewModelFactory {
        val quoteRepository = QuoteRepository.getIstance(FakeDatabase.getInstanced().quoteDao)
        return QouteViewModelFactory(quoteRepository)
    }
}