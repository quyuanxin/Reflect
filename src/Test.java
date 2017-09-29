public class Test {
    public    void load (String className){
        //动态加载类
        //需要加载其他类只需要其实现接口
        try {
            Class c = Class.forName(className);
            //使用接口对象
            Office o =(Office) c.newInstance();
            //调用方法
            o.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main (String[] args){
       // Test t = new Test();
       // t.load("Word");
       int a =123;
       //ClassMessage.printClassFieldMessage(a);
       String b = "22";
       ClassMessage.printConMessage(b);
    }
}
