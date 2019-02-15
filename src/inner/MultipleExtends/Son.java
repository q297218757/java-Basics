package inner.MultipleExtends;

public class Son {
    //继承父亲的strong
    private class father1 extends Father{
        public int strong(){
            return super.strong()+1;
        }
    }

    //继承母亲的kind
    private class monther extends Monther{
        public int kind(){
            return super.kind()-2;
        }
    }

    public int strong(){
        return new father1().strong();
    }

    public int kind(){
        return new monther().kind();
    }

    public static void main(String[] args) {
        Son son = new Son();
        Father father = new Father();
        Monther monther = new Monther();
        System.out.println("父亲的力量指数:"+father.strong());
        System.out.println("母亲的力量指数:"+monther.kind());
        System.out.println("儿子的力量指数:"+son.strong());
        System.out.println("儿子的温柔指数:"+son.kind());
    }
}
