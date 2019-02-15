package inner;

/**
 * 在外部类的静态方法中创建内部类的实例
 */
public class DemoB {
   /*
        当在外部类的静态方法中创建内部类时，当内部类是静态的：
    */
    static class A{
        int a = 10;
        public void b(){
            System.out.println("a.b()");
        }
    }

    static void build(){
       A a = new A();
       a.b();
    }

    /*
    当内部类是非静态的：
     */
    class B{
        int b =10;
        void b(){
            System.out.println("b.b()");
        }
    }
    public static void main(String[] args) {
        DemoB demoB = new DemoB();
        DemoB.B b =  demoB.new B();
        b.b();
        demoB.build();
    }


}
