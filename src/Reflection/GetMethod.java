package Reflection;

import java.lang.reflect.Method;

public class GetMethod {
    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("Reflection.Cat");
        Object o = aClass.getDeclaredConstructor().newInstance();

        //获得有参数的hi方法
        Method hi = aClass.getMethod("hi", String.class);
        Object invoke = hi.invoke(o,"hello");//获得hi方法的返回值,这里可以不用接收返回值
    }
}
