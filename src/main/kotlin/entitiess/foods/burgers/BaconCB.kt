package entitiess.foods.burgers

import entitiess.ingredients.*

class BaconCB : Cheeseburger() {
    override val ingredients: List<Ingredient>  = listOf(Bacon(), Patty(), Cheese(), Lettuce(), Bun())
    override val weight = 325
}
