package designpattern.factorymethod.pizza;

/**
 * 北京披萨
 */
public class BeiJingPizza extends Pizza {
    public BeiJingPizza(){
        name = "北京披萨";
        dough = "厚皮面饼";
        sause = "辣椒酱";
    }

    @Override
    public void bake() {
        System.out.println("北京式bake");
    }
}
