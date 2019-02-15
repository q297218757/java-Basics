package copy.shallowcopy.cpconstruction;

/**
 * 拷贝构造方法的方式实现浅拷贝
 * 引用对象不是真的拷贝了，只是指向同一个地址，所以当引用对象的值改变时，拷贝的对象的值也改变
 */
public class Person {
    private Age age; //引用对象
    private String name;

    public Age getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Person(Age age, String name) {
        this.age = age;
        this.name = name;
    }

    //拷贝构造方法
    public Person(Person p) {
        this.name=p.name;
        this.age=p.age;
    }
}
