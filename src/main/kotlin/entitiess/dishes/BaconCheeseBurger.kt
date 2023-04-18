package entitiess.dishes

import entitiess.foods.burgers.BaconCB
import entitiess.foods.Food
import entitiess.foods.beverages.Mahou
import entitiess.foods.complements.NormalFries

class BaconCheeseBurger : Dish() {
    override val price: Double = 9.50
    override val dishItems: List<Food> = listOf(BaconCB(), NormalFries(), Mahou())
}
