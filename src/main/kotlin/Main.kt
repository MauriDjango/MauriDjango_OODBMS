import entitiess.customer.BNBCustomer
import entitiess.orders.BNBOrder
import entitiess.orders.Order
import io.objectbox.BoxStore





fun main(args: Array<String>) {
    val exampleOrder = BNBOrder.createOrder(BNBCustomer(), BNBOrder())
    val orderBox = ObjectBox.store.boxFor(Order::class.java)

    object ObjectBox {
        private var boxStore: BoxStore? = null
        fun init(context: Context?) {
            boxStore = MyObjectBox.builder()
                .name("objectbox-notes-db")
                .build()
        }

        fun get(): BoxStore? {
            return boxStore
        }
    }

    orderBox.put(exampleOrder)
    val orders = orderBox.all

/*
    val query = orderBox.query().equal(Order_.id, "Joe").build()
*/

    val isRemoved = orderBox.remove(0)
}