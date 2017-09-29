import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ListReflect {
    public  static  void  main(String args[]){
        List<String>list = new ArrayList<>();
        list.add("abc");
        //使用反射绕过编译给list添加int
        //泛型只在编译期间有效
        Class c = list.getClass();
        try {
            Method m = c.getMethod("add",Object.class);
            m.invoke(list,20);
            System.out.println(list);
            //不能用foreach 遍历
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
