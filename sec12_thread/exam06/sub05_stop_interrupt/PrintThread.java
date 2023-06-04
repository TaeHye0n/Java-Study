package sec12_thread.exam06.sub05_stop_interrupt;

public class PrintThread extends Thread {
    //    @Override
//    public void run() {
//        try{
//            while(true){
//                System.out.println("실행 중");
//                Thread.sleep(1);
//            }
//        }catch (InterruptedException e){
//        }
//        System.out.println("자원 정리");
//        System.out.println("실행 종료");
//    }
    @Override
    public void run() {
        while(true){
            System.out.println("실행 중");
            if(Thread.interrupted()) break;
        }
        System.out.println("자원 정리");
        System.out.println("실행 종료");
    }
}
