package chap14_lambda.sec04_class_member_local_val.exam01_field;

public class UsingThis {
    public int outerField = 10;

    class Inner{
        int innerField = 20;

        void method(){
            MyFunctionalInterface fi = () ->{
                System.out.println("outerField: " + outerField);
                // 바깥 객체의 참조를 얻기 위해서는 클래스명.this를 사용
                System.out.println("outerField: " + UsingThis.this.outerField + "\n");

                System.out.println("innerField: " + innerField);
                // 람다식 내부에서 this는 Inner 객체를 참조
                System.out.println("innerField: " + this.innerField + "\n");
            };
            fi.method();
        }
    }

}
