package test.test.basicmvvm.data

class FakeDatabase private constructor() {

    var quoteDao = FakeQuoteDao()
        private set

    companion object {
        @Volatile
        private var instance: FakeDatabase? = null

        fun getInstanced() =
            instance ?: synchronized(this) {
                instance
                    ?: FakeDatabase().also { instance = it }
            }
    }
}