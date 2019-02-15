package designpattern.abstractfactory.pizza;

/**
 * 披萨工厂（抽象工厂）
 * 具体的披萨交给子类来生成
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract  Pizza createPizza(String type);
}
