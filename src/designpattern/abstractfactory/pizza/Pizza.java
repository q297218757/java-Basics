package designpattern.abstractfactory.pizza;

import designpattern.abstractfactory.rawmaterial.cheese.Cheese;
import designpattern.abstractfactory.rawmaterial.clams.Clams;
import designpattern.abstractfactory.rawmaterial.dough.Dough;
import designpattern.abstractfactory.rawmaterial.pepperoni.Pepperoni;
import designpattern.abstractfactory.rawmaterial.sauce.Sauce;

public  abstract class Pizza {
    /**
     * 每个披萨都持有一组在准备时会用到的原料
     */
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    /*
    prepare()方法声明为抽象方法。
    在这个方法中，我们需要收集披萨所需要的原料，而这些原料都是来自原料工厂
     */
    abstract  void prepare();

    public void bake(){
        System.out.println("base bake");
    }

    public void cut(){
        System.out.println("base cut");
    }

    public void box(){
        System.out.println("base box");
    }

    public void  setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
