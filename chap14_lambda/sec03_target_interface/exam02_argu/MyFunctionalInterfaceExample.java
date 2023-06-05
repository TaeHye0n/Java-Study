package chap14_lambda.sec03_target_interface.exam02_argu;

public class MyFunctionalInterfaceExample {
    public static void main(String[] args) {
        MyFunctionalInterface fi;

        fi = (x) ->{
            int result = x * 5;
            System.out.println(result);
        };
        fi.method(2);

        fi = (x) -> {
            System.out.println(x*5);
        };
        fi.method(2);

        // 매개 변수가 하나일 경우에는 괄호를 생략할 수 있다.
        fi = x -> System.out.println(x*5);
        fi.method(2);
    }
}
