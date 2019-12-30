package java8.interfaces;

public class MyImplClass1 implements Interface1, Interface2 {

    @Override
    public void myMethod1() {
        System.out.println(" my method1 ");
    }

    @Override
    public String myMethod2() {
        System.out.println(" my Method2 ");
        return "myMethod2";
    }

    @Override
    public void myDefaultMethod1() {
        System.out.println(" MyImplClass1  myDefaultMethod1() exec.....");
    }
}
