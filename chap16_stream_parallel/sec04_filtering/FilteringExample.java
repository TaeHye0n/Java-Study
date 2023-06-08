package chap16_stream_parallel.sec04_filtering;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("홍길동", "신용권", "김자바", "신용권", "신민철");

        names.stream()
                .distinct()
                .forEach(System.out::println);
        System.out.println();

        names.stream()
                .filter(s -> s.startsWith("신"))
                .forEach(s -> System.out.println(s));
        System.out.println();

        names.stream()
                .distinct()
                .filter(s -> s.startsWith("신"))
                .forEach(System.out::println);
    }
}
