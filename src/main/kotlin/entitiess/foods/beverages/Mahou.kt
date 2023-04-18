package entitiess.foods.beverages

import entitiess.ingredients.Ingredient

class Mahou : Beverage() {
    override val name:String = "Cerveza Mahou"
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
