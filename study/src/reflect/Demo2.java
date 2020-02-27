package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: rbac_shiro
 * @description: 方法反射的使用
 * @author: yuan_shen
 * @create: 2020-02-21 11:36
 **/

public class Demo2 {
    public static void main(String[] args) throws NoSuchMethodException,IllegalAccessException, InvocationTargetException {
        List<String> list = new ArrayList<>();
        list.add("string");
        Class clist = list.getClass();
        Method addMethod = clist.getMethod("add", Object.class);
        addMethod.invoke(list,123);
        System.err.println(list.size());
        for (Object obj : list) {
            System.err.println(obj);
        }
    }
}
