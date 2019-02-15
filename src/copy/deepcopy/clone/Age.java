package copy.deepcopy.clone;

public class Age implements Cloneable {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Age(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Age{" +
                "age=" + age +
                '}';
    }

    //重写Object的clone方法
    public Object clone() {
        Object obj=null;
        try {
            obj=super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }

}
