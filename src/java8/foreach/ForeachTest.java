package java8.foreach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ForeachTest {


    public static void main(String args[]){


        List list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        // using iterator
        Iterator ite = list.iterator();
        while(ite.hasNext()){
            System.out.println(ite.next());
        }


        // using old fashioned for loop
        for(int i=0; i < list.size(); i++){
            System.out.println("print value " + list.get(i));
        }


        // using new forEach with annonymous inner class
        list.forEach(new Consumer(){

            @Override
            public void accept(Object o) {
                System.out.println(" value is " + o);
            }
        });

        // using the TestConsumer Class..
        // This helps to keep the business logic seperate
        //HIGHER SEPERATION OF CONCERN and CLEAN CODE
        TestConsumer testConsumer = new TestConsumer();
        list.forEach(testConsumer);


    }
}
