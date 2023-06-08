package chap16_stream_parallel.sec05_mapping;

import java.util.Arrays;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("홍길동", 10),
                new Student("신용권", 20),
                new Student("김자바", 30)
        );

        studentList.stream()
                .mapToInt(Student::getScore)
                .forEach(System.out::println);
    }
}
