package inner;

/**
 * 在内部类的方法中创建外部类的实例
 */
public class DemoC {
    /*
    *  在内部类的非静态方法中创建外部类的实例。（使用外部类.this来创建外部类的实例）
    */
    class A{
        int a = 10;
        void build(){
            //使用外部类.this来创建外部类的实例）
            DemoC c = DemoC.this;
            //直接new外部类的对象
            DemoC c1 = new DemoC();
            c.a();
            c1.a();
        }
    }

    /*
       在内部类的静态方法中创建外部类的实例。（直接通过new来创建)
     */
    static class B{
        int a = 10;
        static void build(){
            //不能使用this，编译出错
            //DemoC c = DemoC.this;
            //直接new外部类的对象
            DemoC c1 = new DemoC();
            c1.a();
        }
    }
    public void a(){
        System.out.println("demoC.a()");
    }

    public static void main(String[] args) {
        DemoC demoC = new DemoC();
        A a = demoC.new A();
        B.build();
        //a.build();
    }
}
