package inner;

/**
 * 在其它类中创建内部类实例。
 */
public class DemoD {
    class A{
        void a(){
            System.out.println("A.a()");
        }
    }

    static class C{
        void c (){
            System.out.println("C.c()");
        }
    }

}
class B{
    public static void main(String[] args) {
        //创建非静态内部类
        DemoD demoD = new DemoD();
        DemoD.A a = demoD.new A();
        a.a();
        //创建静态内部类
        DemoD.C c = new DemoD.C();
        c.c();
    }

}
