package chap14_lambda.sec03_target_interface.exam01_no_argu_no_return;

public class MyFunctionalInterfaceExample {
    public static void main(String[] args) {
        MyFunctionalInterface fi;

        fi = () ->{
            String str = "method call1";
            System.out.println(str);
        };
        fi.method();

        fi = () ->{
            System.out.println("method call2");
        };
        fi.method();

        fi = () ->{
            System.out.println("method call3");
        };
        fi.method();
    }
}
