package chap16_stream_parallel.sec02_stream_kind;

import java.util.stream.IntStream;

public class FromIntRangeExample {
    public static int sum;

    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1, 100);
        intStream.forEach(i -> sum += i);
        System.out.println("총합: " + sum);
    }
}
