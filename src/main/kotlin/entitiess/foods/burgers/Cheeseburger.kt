package entitiess.foods.burgers

import entitiess.foods.Food
import io.objectbox.annotation.Entity

@Entity
abstract class Cheeseburger: Food() {

    override fun grill() {//Placeholder Would hold code to simulate behaviour of cooking the burger.
        // This might migrate to ingredients rather than food
    }
    override fun boil() {
        //Placeholder
    }
    override fun fry() {
        //Placeholder
    }
    override fun steam() {
        //Placeholder
    }
    override fun bake() {
        //Placeholder
    }
}