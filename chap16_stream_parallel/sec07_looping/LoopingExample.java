package chap16_stream_parallel.sec07_looping;

import java.util.Arrays;

public class LoopingExample {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5};

        System.out.println("[peek()를 마지막에 호출한 경우]");
        Arrays.stream(intArr)
                .filter(a -> a%2 == 0)
                .peek(n -> System.out.println(n)); // 동작하지 않음

        System.out.println("[최종 처리 메소드를 마지막에 호출한 경우]");
        int total = Arrays.stream(intArr)
                .filter(a -> a%2 == 0)
                .peek(System.out::println)
                .sum();
        System.out.println("총합: " + total);

        System.out.println("[forEach()를 마지막에 호출한 경우]");
        Arrays.stream(intArr)
                .filter(a -> a%2 ==0)
                .forEach(System.out::println);
    }
}
