package entitiess.foods

import entitiess.ingredients.Ingredient
import interfaces.Cook

abstract class Food: Cook {
    abstract val ingredients: List<Ingredient>
    abstract val weight: Int
}
