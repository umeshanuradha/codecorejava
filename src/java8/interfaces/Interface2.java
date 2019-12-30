package java8.interfaces;

public interface Interface2 {


    public String myMethod2();

    public default void myDefaultMethod1(){
        System.out.println(" Interface2 myDefaultMethod2 exec");
    }
}
