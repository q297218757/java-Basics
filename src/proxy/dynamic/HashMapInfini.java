package proxy.dynamic;

import java.util.HashMap;

public class HashMapInfini {
    private static HashMap map = new HashMap(2,0.75f);

    public static void main(String[] args) {
        map.put(5,"c");

        new Thread("t1"){
            public void run(){
                map.put(7,"b");
                System.out.println(map);
            };
        }.start();

        new Thread("t2"){
            public void run(){
                map.put(3,"b");
                System.out.println(map);
            };
        }.start();

    }
}
