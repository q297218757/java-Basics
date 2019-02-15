package designpattern.abstractfactory;

import designpattern.abstractfactory.pizza.NYPizzaStore;
import designpattern.abstractfactory.pizza.Pizza;

/**
 * 获得一个披萨的流程
 * 抽象披萨仓库->具体披萨仓库->抽象原料仓库->具体原料仓库->抽象披萨->具体披萨
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("------小明需要纽约披萨-------");
        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza guangZhouPizza = nyPizzaStore.orderPizza("cheese");
        guangZhouPizza.getName();

    }
}
