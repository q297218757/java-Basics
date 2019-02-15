package copy.shallowcopy.clone;

public class main  {
    public static void main(String[] args) {
       Age age  = new Age(20);
        Person stu1 = new Person(age, "摇头耶稣", 175);

        //通过调用重写后的clone方法进行浅拷贝
        Person stu2 = (Person) stu1.clone();
        System.out.println(stu1.toString());
        System.out.println(stu2.toString());

        //尝试修改stu1中的各属性，观察stu2的属性有没有变化
        stu1.setName("大傻子");
        //改变age这个引用类型的成员变量的值
       age.setAge(99);
        //stu1.setaAge(new Age(99));    使用这种方式修改age属性值的话，stu2是不会跟着改变的。因为创建了一个新的Age类对象而不是改变原对象的实例值
        stu1.setLen(216);
        System.out.println(stu1.toString());
        System.out.println(stu2.toString());
    }
}
