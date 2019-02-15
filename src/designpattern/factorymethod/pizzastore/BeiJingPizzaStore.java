package designpattern.factorymethod.pizzastore;

import designpattern.factorymethod.pizza.BeiJingPizza;
import designpattern.factorymethod.pizza.Pizza;

/**
 * 具体工厂
 * 广州披萨工厂
 * 具体负责创建个性化披萨，披萨的具体生成
 */
public class BeiJingPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if("辣椒酱".equals(type)){
            pizza = new BeiJingPizza();
        }else if ("厚皮面饼".equals(type)){
            pizza = new BeiJingPizza();
        }else if("北京".equals(type)){
            pizza = new BeiJingPizza();
        }
        return pizza;
    }
}
