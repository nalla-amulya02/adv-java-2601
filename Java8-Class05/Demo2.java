package Java8;

public class Demo2 {

    @FunctionalInterface
    interface Add{
        int add(int a, int b);
    }
    public static void main(String[] args) {
        Add obj = (a,b) ->  a+b ;
        System.out.println(obj.add(2,3));
    }
}


