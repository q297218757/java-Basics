package designpattern.abstractfactory.pizza;

import designpattern.abstractfactory.rawmaterial.factory.PizzaIngredientFactory;

public class ClamPizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory){
        this.pizzaIngredientFactory = ingredientFactory;
    }
    @Override
    void prepare() {
        System.out.println("Prepare..."+ name);
        dough = pizzaIngredientFactory.createDough();
        sauce  = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        clams = pizzaIngredientFactory.createClams();
    }
}
