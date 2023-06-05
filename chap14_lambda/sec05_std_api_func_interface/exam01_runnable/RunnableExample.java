package chap14_lambda.sec05_std_api_func_interface.exam01_runnable;

public class RunnableExample {
    public static void main(String[] args) {
        Runnable runnable = ()->{
            for(int i = 0; i < 10; i++){
                System.out.println(i + " " + Thread.currentThread().getName());
            }
        };

        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(()->{
           for(int i = 0; i < 10; i++){
               System.out.println(i + " " + Thread.currentThread().getName());
           }
        });
        thread.start();
        thread1.start();
    }
}
