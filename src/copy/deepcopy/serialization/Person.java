package copy.deepcopy.serialization;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private Age age;
    private int len;

    public String getName() {
        return name;
    }

    public Age getAge() {
        return age;
    }

    public int getLen() {
        return len;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public Person(String name, Age age, int len) {
        this.name = name;
        this.age = age;
        this.len = len;
    }

    public String toString() {
        return "姓名是： "+this.getName()+"， 年龄为： "+this.getAge().toString()+", 长度是： "+this.getLen();
    }
}
