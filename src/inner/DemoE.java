package inner;

/**
 * 内部类中的多层嵌套
 */
public class DemoE {
    void a(){
        System.out.println("a()");
    }

    class B{
        void b(){
            System.out.println("B.b()");
        }

        class C{
            void c(){
                a();
                b();
                System.out.println("c()");
            }
        }
    }

    public static void main(String[] args) {
        DemoE e = new DemoE();
        DemoE.B.C c = e.new B().new C();
        c.c();
    }
}
