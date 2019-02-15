package copy.deepcopy.serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 序列化深拷贝
 *
 */
public class Main {
    String name  = "全局变量";
    public static void main(String[] args)  throws IOException, ClassNotFoundException {
//        Age a=new Age(20);
//        Person stu1=new Person("摇头耶稣",a,175);
//        //通过序列化方法实现深拷贝
//        ByteArrayOutputStream bos=new ByteArrayOutputStream();
//        ObjectOutputStream oos=new ObjectOutputStream(bos);
//        oos.writeObject(stu1);
//        oos.flush();
//        ObjectInputStream ois=new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()));
//        Person stu2=(Person) ois.readObject();
//        System.out.println(stu1.toString());
//        System.out.println(stu2.toString());
//        System.out.println();
//        //尝试修改stu1中的各属性，观察stu2的属性有没有变化
//        stu1.setName("大傻子");
//        //改变age这个引用类型的成员变量的值
//        a.setAge(99);
//        stu1.setLen(216);
//        System.out.println(stu1.toString());
//        System.out.println(stu2.toString());
        List list = new LinkedList();
        List list1 = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        Main main = new Main();
        main.a();
        //System.out.println(list.get(10));
    }
    public  void a(){
        System.out.println(name);
    }

}


