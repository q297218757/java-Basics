package designpattern.abstractfactory.pizza;

import designpattern.abstractfactory.rawmaterial.factory.NYPizzaIngredientFactory;
import designpattern.abstractfactory.rawmaterial.factory.PizzaIngredientFactory;

/**
 * 纽约披萨仓库（具体工厂）
 */
public class NYPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        //使用纽约的原料工厂
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if("cheese".equals(type)){
                         pizza = new CheesePizza(ingredientFactory);
                         pizza.setName("New York Style Cheese Pizza");
         }else if("clam".equals(type)){
                         pizza = new ClamPizza(ingredientFactory);
                         pizza.setName("New York Style Clam Pizza");
        }
        return pizza;

    }
}
