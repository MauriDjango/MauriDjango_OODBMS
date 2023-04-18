import io.objectbox.BoxStore

object ObjectBox {
    lateinit var store: BoxStore
        private set

    /*fun init(context: Context) {
        store = Order.builder()
            .androidContext(context.applicationContext)
            .build()
    }*/
}