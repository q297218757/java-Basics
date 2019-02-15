package designpattern.factorymethod.pizza;

import designpattern.factorymethod.pizza.Pizza;

/**
 * 具体工厂
 * 广州披萨
 * 具体负责创建个性化披萨，披萨的具体生成
 */
public class GuangZhouPizza extends Pizza {
    public GuangZhouPizza(){
        name = "广州披萨";
        dough = "薄皮面饼";
        sause = "甜酱";
    }

    @Override
    public void cut() {
        System.out.println("广州式切面");
    }
}
