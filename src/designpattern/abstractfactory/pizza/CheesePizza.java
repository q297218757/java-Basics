package designpattern.abstractfactory.pizza;

import designpattern.abstractfactory.rawmaterial.factory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {

    //披萨原料工厂
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
        prepare();
    }
    //准备原料
    @Override
    void prepare() {
        System.out.println("prepareing..."+name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
