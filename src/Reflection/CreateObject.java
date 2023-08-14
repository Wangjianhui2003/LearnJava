//反射机制创建类的实例
package Reflection;

import java.lang.reflect.Constructor;

public class CreateObject {
    public static void main(String[] args) throws Exception {
        //通过public构造器创建实例,参数String
        Class<?> aClass = Class.forName("Reflection.Cat");
        Constructor<?> Constructor1 = aClass.getConstructor(String.class);
        Object mimo = Constructor1.newInstance("mimo");
        System.out.println(mimo);

        //通过private构造器创建实例,setAccessible,参数String,Int
        Constructor<?> Constructor2 = aClass.getDeclaredConstructor(String.class, int.class);
        Constructor2.setAccessible(true);
        Object lura = Constructor2.newInstance("lura", 12);
        System.out.println(lura);

}
}
