package copy.deepcopy.serialization;

import java.io.Serializable;

public class Age implements Serializable {
    private int age;
    public Age(int age) {
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return this.age+"";
    }
}
