package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;

/**
 *  动态代理
 *  代理工厂：给多个目标对象生成代理对象！
 */
public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    // 返回对目标对象(target)代理后的对象(proxy)
    public Object getProxyFactory(){
        Object proxy = Proxy.newProxyInstance(
                target.getClass().getClassLoader(), //目标对象使用的类加载器
                target.getClass().getInterfaces(),//目标对象实现的所有接口
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // 获取当前执行的方法的方法名
                        String methodName = method.getName();
                        // 方法返回值
                        Object result = null;
                        if ("find".equals(methodName)) {
                            // 直接调用目标对象方法
                            result = method.invoke(target, args);
                        } else {
                            System.out.println("开启s事务...");
                            // 执行目标对象方法
                            result = method.invoke(target, args);
                            System.out.println("提交事务...");
                        }
                        return result;
                    }
                }
        );
        return proxy;
    }

    public static void main(String[] args) {
        IUserDao iUserDao = new User();
        IUserDao userDao = (IUserDao) new ProxyFactory(iUserDao).getProxyFactory();
        System.out.println("代理对象： "+userDao.getClass());
        userDao.save();
        }
}
