package designpattern.factorymethod.pizzastore;

import designpattern.factorymethod.pizza.GuangZhouPizza;
import designpattern.factorymethod.pizza.Pizza;

/**
 * 具体工厂
 * 广州披萨工厂
 */
public class GuangZhouPizzaStore  extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if("甜酱".equals(type)){
            pizza = new GuangZhouPizza();
        }else if ("薄皮面饼".equals(type)){
            pizza = new GuangZhouPizza();
        }else if("广州".equals(type)){
            pizza = new GuangZhouPizza();
        }
        return pizza;
    }
}
