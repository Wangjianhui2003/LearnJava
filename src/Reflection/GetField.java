//反射机制访问类的属性(私有)
package Reflection;

import java.lang.reflect.Field;

public class GetField {
    public static void main(String[] args) throws Exception{
        Class<?> aClass = Class.forName("Reflection.Cat");
        Object o = aClass.getDeclaredConstructor().newInstance();

        //访问私有属性(getField()访问公有),并设为可访问
        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(o,"mimi");//.set(null,"mimi")如果为static属性可以用null替代
        System.out.println(name);
    }
}
