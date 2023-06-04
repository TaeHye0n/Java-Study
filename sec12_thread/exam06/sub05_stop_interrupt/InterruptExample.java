package sec12_thread.exam06.sub05_stop_interrupt;

public class InterruptExample {
    public static void main(String[] args) {
        Thread thread = new PrintThread();
        thread.start();

        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){}

        thread.interrupt();
    }
}
