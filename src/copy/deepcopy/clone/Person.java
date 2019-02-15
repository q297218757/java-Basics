package copy.deepcopy.clone;

public class Person implements Cloneable {
    private Age age; //引用对象
    private String name;
    private int len;

    public Age getAge() {
        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", len=" + len +
                '}';
    }

    public Person(Age age, String name, int len) {
        this.age = age;
        this.name = name;
        this.len = len;
    }

    //重写Object的clone方法
    public Object clone() {
        Object obj=null;
        try {
            obj=super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        //调用Age类的clone方法进行深拷贝
        //先将obj转化为学生类实例
        Person pre=(Person)obj;
        //学生类实例的Age对象属性，调用其clone方法进行拷贝
        pre.age=(Age)pre.getAge().clone();
        return obj;
    }
}
