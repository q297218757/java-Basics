package designpattern.simplefactory;

import designpattern.simplefactory.pizza.Pizza;

public class Main {
    public static void main(String[] args) {
        SimplyPizzaFactory simplyPizzaFactory = new SimplyPizzaFactory();

       Pizza pizza =  simplyPizzaFactory.createPizza("cheese");
       pizza.cut();

    }
}
