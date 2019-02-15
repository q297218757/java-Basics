package designpattern.abstractfactory.rawmaterial.factory;

import designpattern.abstractfactory.rawmaterial.clams.FreshClams;
import designpattern.abstractfactory.rawmaterial.pepperoni.Pepperoni;
import designpattern.abstractfactory.rawmaterial.cheese.Cheese;
import designpattern.abstractfactory.rawmaterial.cheese.ReggianoCheese;
import designpattern.abstractfactory.rawmaterial.clams.Clams;
import designpattern.abstractfactory.rawmaterial.dough.Dough;
import designpattern.abstractfactory.rawmaterial.dough.ThinCrustDough;
import designpattern.abstractfactory.rawmaterial.pepperoni.SlicedPepperoni;
import designpattern.abstractfactory.rawmaterial.sauce.MarinaraSauce;
import designpattern.abstractfactory.rawmaterial.sauce.Sauce;

/**
 * 纽约原料工厂（具体工厂）
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

//    @Override
//    public Veggies[] createVeggies() {
//        return new Veggies[0];
//    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
