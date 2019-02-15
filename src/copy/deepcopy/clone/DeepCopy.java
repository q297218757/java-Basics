package copy.deepcopy.clone;

/**
 * clone()方法深度拷贝
 * 缺点：需要在每一个引用变量中clone一次
 */
public class DeepCopy {
    public static void main(String[] args) {
        Age a=new Age(20);
        Person stu1=new Person(a,"摇头耶稣",175);

        //通过调用重写后的clone方法进行浅拷贝
        Person stu2=(Person)stu1.clone();
        System.out.println(stu1.toString());
        System.out.println(stu2.toString());
        System.out.println();

        //尝试修改stu1中的各属性，观察stu2的属性有没有变化
        stu1.setName("大傻子");
        //改变age这个引用类型的成员变量的值
        a.setAge(99);
        //stu1.setaAge(new Age(99));    使用这种方式修改age属性值的话，stu2是不会跟着改变的。因为创建了一个新的Age类对象而不是改变原对象的实例值
        stu1.setLen(216);
        System.out.println(stu1.toString());
        System.out.println(stu2.toString());
    }
}
