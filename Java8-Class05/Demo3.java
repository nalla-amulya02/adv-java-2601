package Java8;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Demo3 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5,6,7,8,9,10);
        List<String> s = Arrays.asList("Python","java","cpp","c#");
        List<Integer> result = numbers.stream().filter(n -> n%2 == 0).map(n -> n*n).collect(Collectors.toList());

        List<String> r= s.stream().filter( s1-> s1.contains("c")).map(s2 -> s2.replace("c","k")).collect(Collectors.toList());
        System.out.println(r);
        System.out.println(result);

    }
    
}
