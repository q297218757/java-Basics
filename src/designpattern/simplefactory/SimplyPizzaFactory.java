package designpattern.simplefactory;

import designpattern.simplefactory.pizza.CheesePizza;
import designpattern.simplefactory.pizza.Pizza;

/**
 * 用于创建披萨的工厂类
 */
public class SimplyPizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if ("cheese".equals(type)) {
            //奶酪披萨
            pizza = new CheesePizza();
        }
        return pizza;
    }
}
