public class ClassDemo {
    public static void main(String [] args){

        Foo foo1 = new Foo();
        //任何一个类都是Class的实例对象，
        Class c1 = Foo.class; //通过类名

        Class c2 = foo1.getClass(); //通过实例对象的getclass方法

        // c1 和 c2 是Class 类的实例对象，所有类的都是Class类的实例
        System.out.print(c1 ==c2);//  一个类就是class的一个实例对象
        Class c3=null;
        try {
            c3=Class.forName("reflect.Foo");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Foo f1 =(Foo) c1.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

class Foo{

}