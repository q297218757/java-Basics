package inner;

/**
 * 在外部类的非静态方法中创建内部类的实例
 */
public class DemoA {
    class A{
        int a = 10 ;
        public void b(){
            System.out.println("A.b()");
        }
    }

    public void build(){
        A a = new A();
        a.b();
    }

    public static void main(String[] args) {
        DemoA demoA = new DemoA();
        demoA.build();
        //A a =  new DemoA().new A();
        //a.b();
    }
}
