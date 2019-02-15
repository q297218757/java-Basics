package polymorphic;

import java.util.List;

public class demo {
    public static class A {
        public String show(D obj) {
            return ("A and D");
        }

        public String show(A obj) {
            return ("A and A");
        }

    }

    public static class B extends A{
        public String show(B obj){
            return ("B and B");
        }

        public String show(A obj){
            return ("B and A");
        }
    }

    public static class C extends B{

    }

    public static class D extends B{

    }

        public static void main(String[] args) {
            byte bb = 127;
            byte bc = 127;
            bb += 127;
           A a1 = new A();
            A a2 = new B();
            B b = new B();
            C c = new C();
            D d = new D();
            System.out.println(a1.getClass());
            System.out.println(a2.getClass() == b.getClass());
            System.out.println(c instanceof B);
            System.out.println(a2.getClass());
            System.out.println(b.getClass());
            System.out.println(c.getClass());
            System.out.println(d.getClass());

//            System.out.println("1--" + a1.show(b));
//            System.out.println("2--" + a1.show(c));
//            System.out.println("3--" + a1.show(d));
//            /*
//                方法调用的优先级
//                this.show(O)、super.show(O)、this.show((super)O)、super.show((super)O)
//             */
//            System.out.println("4--" + a2.show(b));
//            System.out.println("5--" + a2.show(c));
//            System.out.println("6--" + a2.show(d));
//            System.out.println("7--" + b.show(b));
//            System.out.println("8--" + b.show(c));
//            System.out.println("9--" + b.show(d));
        }

}
