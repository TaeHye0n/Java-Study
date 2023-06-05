package chap12_thread.exam06.sub03_join;

public class JoinExample {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
//        sumThread.setSum(1);
        sumThread.start();

        try{
            sumThread.join();
        }catch (InterruptedException e){}

        System.out.println("1~100 합: " + sumThread.getSum());
    }
}
