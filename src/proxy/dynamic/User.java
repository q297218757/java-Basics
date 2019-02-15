package proxy.dynamic;


import java.util.HashMap;

public class User implements IUserDao {
    @Override
    public void save() {
        System.out.println("模拟：保存用户");
    }

    @Override
    public void find() {
        System.out.println("查新用户");
    }


}
