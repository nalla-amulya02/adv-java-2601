package Java8;

@FunctionalInterface
interface ExampleInterface {
    void exampleMethod();
}

// class ExampleClass implements ExampleInterface {
// @Override
// public void exampleMethod() {
// System.out.println("This is an example method.");
// }
// }

public class JavaDemo {

    public static void main(String[] args) {
        // System.out.println("Hello, Java 8!");
        // ExampleClass example = new ExampleClass();
        // ExampleInterface example = new ExampleInterface() {
        //     @Override
        //     public void exampleMethod() {
        //         System.out.println("This is an example method.");
        //     }
        // };

        ExampleInterface example = () -> {System.out.println("This is an example method.");};
        example.exampleMethod();
    }
}
