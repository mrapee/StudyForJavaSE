package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @program: rbac_shiro
 * @description: 动态获取类的信息
 * @author: yuan_shen
 * @create: 2020-02-20 20:02
 **/

public class ClassMessage {

    public static void getMethodMessage(Object obj){
        Class c = obj.getClass();
        System.err.println("类的名称是：" + c.getName());

        //获取类的方法信息
        Method[] methods = c.getMethods();
        for (Method method : methods) {
            //方法的返回类型
            Class returnType = method.getReturnType();
            System.err.print(returnType.getSimpleName()+" ");
            //方法的名称
            System.err.print(method.getName() + "(");
            //方法的参数列表
            Class[] paramType = method.getParameterTypes();
            if (paramType.length == 0)
                System.err.println(")");
            else {
                for (int i = 0; i < paramType.length; i++) {
                    if (i != paramType.length - 1)
                        System.err.print(paramType[i].getSimpleName()+",");
                    else System.err.println(paramType[i].getSimpleName() + ")");
                }
            }
        }
    }
    public static void getFieldMessage(Object obj){
        Class c = obj.getClass();
        System.err.println("类的名称是：" + c.getName());
        Field[] fields = c.getFields();
        for (Field field : fields) {
            Class cf = field.getType();
            System.err.print(cf.getSimpleName()+ " ");
            System.err.println(field.getName() + ";");
        }
    }

}
