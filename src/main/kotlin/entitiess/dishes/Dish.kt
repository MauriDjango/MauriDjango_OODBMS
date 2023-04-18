package entitiess.dishes

import entitiess.foods.Food

abstract class Dish {
    abstract val price: Double
    abstract val dishItems: List<Food>
}
