package designpattern.factorymethod.pizzastore;

import designpattern.factorymethod.pizza.Pizza;

/**
 * 抽象工厂
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return  pizza;
    }

    abstract Pizza createPizza(String type);
}
