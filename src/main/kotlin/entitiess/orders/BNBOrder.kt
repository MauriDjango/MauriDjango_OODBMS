package entitiess.orders

import entitiess.customer.Customer
import entitiess.dishes.BaconCheeseBurger
import entitiess.dishes.Dish

class BNBOrder: Order() {
    companion object {
        fun createOrder(customer: Customer, order: BNBOrder): Order {
            order.customer = customer
            return order
        }
    }
    override var price = 0.0
    override val orderItems: List<Dish> = listOf(BaconCheeseBurger())
    override lateinit var customer: Customer

    init {
        getPrice()
    }

    override fun getPrice() {
        orderItems.let {
            for (dish in it) {
                price += dish.price
            }
        }
    }
}