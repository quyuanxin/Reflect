import java.lang.reflect.Method;

public class MethodDemo {
    public static void main (String[] args) {
        A a1 = new A();
        Class c = a1.getClass();

        try {
            Method m = c.getMethod("print",int.class, int.class);
            Object o = m.invoke(a1,10,20);
            System.out.print(o);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

class A {
    public  void print(int a , int b ){
        System.out.println(a+b);
    }
    public  void print (int a ){
        System.out.println(a);
    }

}
