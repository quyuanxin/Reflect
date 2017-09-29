
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMessage {
    //输出类的信息 ，包括类的成员函数，成员变量
    public  static void printClassMethodMessage(Object obj){
        Class c  = obj.getClass();

        System.out.println("类名："+c.getName());
        System.out.println("成员方法:");
        Method[] ms= c.getMethods();
        for(int i=0;i<ms.length;++i){
            //方法类型
            Class returnType = ms[i].getReturnType();
            System.out.println("方法类型"+returnType.getName()+" ");
            System.out.print(ms[i].getName()+"(");
            Class[]paramTypes = ms[i].getParameterTypes();
            for(Class class1:paramTypes) {
                System.out.print(class1.getSimpleName() + ",");
            }
            System.out.println(")");


        }

    }
    public static  void printClassFieldMessage(Object obj){
        Class c  = obj.getClass();
        System.out.println("成员变量:");
        Field []fs = c.getDeclaredFields();
        for(Field field:fs){
            //成员变量的类型
            Class fieldType = field.getType();
            String typeName =fieldType.getName();
            //得到成员变量的名称
            String fieldName = field.getName();
            System.out.println("类型："+typeName+" 变量名："+fieldName);
        }
    }
    public static  void printConMessage(Object obj){
        Class c = obj.getClass();

        Constructor[] cs = c.getDeclaredConstructors();
        for(Constructor constructor:cs){
            System.out.print("控制器名称："+constructor.getName()+" 参数列表(");
            Class[]paramTypes = constructor.getParameterTypes();
            for(Class class1 : paramTypes){
                System.out.print("参数名："+class1.getName()+" ");
            }
            System.out.println(")");
        }
    }

}
