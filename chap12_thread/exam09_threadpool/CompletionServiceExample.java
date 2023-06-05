package chap12_thread.exam09_threadpool;

import java.util.concurrent.*;

public class CompletionServiceExample extends Thread{
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(
            Runtime.getRuntime().availableProcessors()
        );

        CompletionService<Integer> completionService =
                new ExecutorCompletionService<>(executorService);

        System.out.println("[작업 처리 요청]");
        for(int i = 0; i < 3; i++){
            completionService.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    int sum = 0;
                    for(int i = 1; i <= 10; i++) sum += i;
                    System.out.println(Thread.currentThread().getName());
                    return sum;
                }
            });
        }

        System.out.println("[처리 완료된 작업 확인]");
        // Take() 메소드는 블로킹 되기 때문에 스레드풀에 작업처리 요청
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                while(true){
                    try{
                        Future<Integer> future = completionService.take();
                        int value = future.get();
                        System.out.println(Thread.currentThread().getName());
                        System.out.println("[처리 결과] " + value);
                    } catch (Exception e) {
                        break;
                    }
                }
            }
        });

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){}
        executorService.shutdownNow();
    }
}
