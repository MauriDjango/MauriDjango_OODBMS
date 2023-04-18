package entitiess.orders

import entitiess.customer.Customer
import entitiess.dishes.Dish
import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id
import java.time.LocalDateTime

@Entity
//TODO lookup how to make a construcotr invisble to only create objects through companion object
abstract class Order {
    companion object {
        fun createOrder(customer:Customer, order: Order) {
            order.customer = customer
        }
    }
    @Id
    val id: Long = 0
    val timeOrder: LocalDateTime? = LocalDateTime.now()
    abstract var price: Double
    abstract val orderItems: List<Dish>
    abstract var customer: Customer

    abstract fun getPrice()
}