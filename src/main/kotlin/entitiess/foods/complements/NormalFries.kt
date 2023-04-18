package entitiess.foods.complements

import entitiess.foods.Food
import entitiess.ingredients.Ingredient

class NormalFries: Food() {
    override val ingredients: List<Ingredient>
        get() = TODO("Not yet implemented")
    override val weight: Int
        get() = TODO("Not yet implemented")

    override fun grill() {
        TODO("Not yet implemented")
    }

    override fun boil() {
        TODO("Not yet implemented")
    }

    override fun fry() {
        TODO("Not yet implemented")
    }

    override fun steam() {
        TODO("Not yet implemented")
    }

    override fun bake() {
        TODO("Not yet implemented")
    }
}