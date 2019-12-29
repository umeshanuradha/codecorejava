package java8.foreach;

import java.util.function.Consumer;

public class TestConsumer implements Consumer {

    @Override
    public Consumer andThen(Consumer after) {
        System.out.println(" after consumer");
        return null;
    }

    @Override
    public void accept(Object o) {
        System.out.println("now value is " + o);
    }
}
