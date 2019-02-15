package copy.shallowcopy.clone;

import copy.shallowcopy.clone.Age;

/**
 * 拷贝构造方法的方式实现浅拷贝
 * 引用对象不是真的拷贝了，只是指向同一个地址，所以当引用对象的值改变时，拷贝的对象的值也改变
 */
public class Person implements Cloneable {
    private Age age; //引用对象
    private String name;
    private int len;

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

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


    public Person(Age age, String name, int len) {
        this.age = age;
        this.name = name;
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

    @Override
    public Object clone(){
        Object o = null;
        try{
            o = super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return  o ;
    }
}
