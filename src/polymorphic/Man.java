package polymorphic;

public class Man extends Person {
    public void say(String s ){
        System.out.println("this is a man");
    }

    public static  void s(String ... value){
        System.out.println(value.length);
    }

    public void tall(){
        System.out.println("this is a man");
    }

    public static void main(String[] args) {
        s("1","2","3","4");
    }
}
