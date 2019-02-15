package designpattern.factorymethod.pizza;

/**
 * 相当于总店的披萨配方（你不修改就默认使用总店的配方）
 */
public abstract  class Pizza {
    protected String name;//名称
    protected String dough; //面团
    protected String sause; //酱料

    public void prepare(){
        System.out.println("prepare:"+name);
        System.out.println("Tossing dought");
        System.out.println("Adding sause");
    }

    public void bake(){
        System.out.println("base bake");
    }

    public void cut(){
        System.out.println("base cut");
    }

    public void box(){
        System.out.println("base box");
    }

    public String getName(){
        return name;
    }
}
