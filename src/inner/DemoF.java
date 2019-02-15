package inner;

/**
 * 继承内部类
 */
public class DemoF {
    static void takesA(AA A){

    }

    static void takesB(BB B){

    }

    public static void main(String[] args) {
        CC cc = new CC();
        takesA(cc);
        takesB(cc.makeB());
    }
}

class AA{

}


abstract class BB{

}

class CC extends AA{
    BB makeB(){
        return new BB(){

        };
    }
}
