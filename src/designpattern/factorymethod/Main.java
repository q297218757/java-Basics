package designpattern.factorymethod;

import designpattern.factorymethod.pizza.Pizza;
import designpattern.factorymethod.pizzastore.BeiJingPizzaStore;
import designpattern.factorymethod.pizzastore.GuangZhouPizzaStore;

public class Main {
    public static void main(String[] args) {
        System.out.println("------小明需要广州披萨-------");
        GuangZhouPizzaStore guangZhouPizzaStore = new GuangZhouPizzaStore();
        Pizza guangZhouPizza = guangZhouPizzaStore.orderPizza("广州");
        guangZhouPizza.getName();

        System.out.println("--------小红需要北京披萨--------");
        BeiJingPizzaStore beiJingPizzaStore = new BeiJingPizzaStore();
        Pizza beiJingPizza = beiJingPizzaStore.orderPizza("北京");
        beiJingPizza.getName();
    }
}
