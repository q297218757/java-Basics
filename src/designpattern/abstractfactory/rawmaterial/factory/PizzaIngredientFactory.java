package designpattern.abstractfactory.rawmaterial.factory;

import designpattern.abstractfactory.rawmaterial.pepperoni.Pepperoni;
import designpattern.abstractfactory.rawmaterial.cheese.Cheese;
import designpattern.abstractfactory.rawmaterial.clams.Clams;
import designpattern.abstractfactory.rawmaterial.dough.Dough;
import designpattern.abstractfactory.rawmaterial.sauce.Sauce;

/**
 * 原料工厂(抽象工厂)
 * 负责创建所有的原料
 */
public interface  PizzaIngredientFactory {
    /*
       在接口中，每一个原料都有一个对应的方法创建该原料
     */
    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

//    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClams();

}
