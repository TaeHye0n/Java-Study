package chap12_thread.exam09_threadpool;

import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallbackExample {
    private final ExecutorService executorService;

    public CallbackExample(){
        executorService = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors()
        );
    }

    private final CompletionHandler<Integer, Void> callback =
    new CompletionHandler<>(){
        @Override
        public void completed(Integer result, Void attachment) {
            System.out.println("completed() 실행: " + result);
        }

        @Override
        public void failed(Throwable exc, Void attachment) {
            System.out.println("failed()실행: " + exc.toString());
        }
    };

    public void doWork(final String x, final String y){
        Runnable task = new Runnable() {
            @Override
            public void run() {
                try{
                    int intX = Integer.parseInt(x);
                    int intY = Integer.parseInt(y);
                    int result = intX + intY;
                    callback.completed(result, null);
                }catch (NumberFormatException e){
                    callback.failed(e, null);
                }
            }
        };
        executorService.submit(task);
    }

    public void finish(){
        executorService.shutdown();
    }

    public static void main(String[] args) {
        CallbackExample callbackExample = new CallbackExample();
        callbackExample.doWork("3", "3");
        callbackExample.doWork("3", "삼");
        callbackExample.finish();
    }
}
