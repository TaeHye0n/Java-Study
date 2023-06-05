package chap14_lambda.sec04_class_member_local_val.exam02_local;

public class UsingLocalVariable {
    void method(int arg){
        int localVar = 40;

        // 익명 객체에서의 로컬 변수와 매개 변수는 final 속성이라 읽기만 가능
        // arg = 31;
        // localVar = 41;

        MyFunctionalInterface fi = () ->{
            System.out.println("arg: " + arg);
            System.out.println("localVar: " + localVar + "\n");
        };
        fi.method();
    }
}
