package java8.interfaces;

public interface Interface1 {

    public void myMethod1();

    default void myDefaultMethod1(){
        System.out.println(" interface1 default method 1");
    }
}
