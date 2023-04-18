package entitiess.customer

import io.objectbox.annotation.Id

abstract class Customer {
    @Id
    val id: Long = 0
    abstract val name: String
}
