package sec12.exam01;

import java.awt.*;

public class BeepPrintExample2 {
    public static void main(String[] args) {
        Runnable beepTask = new BeepTask();
        Thread thread = new Thread(beepTask);
        thread.start();

        for(int i = 0; i < 5; i++){
            System.out.println("띵");
            try{
                Thread.sleep(500);
            }catch (Exception e){}
        }

        //Runnable 익명객체
        Thread thread1 = new Thread(new Runnable(){
            @Override
            public void run(){
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for(int i = 0 ; i < 5 ; i++){
                    toolkit.beep();
                    try{
                        Thread.sleep(500);
                    }catch (Exception e) {}
                }
            }
        });

        //람다식 이용
        Thread thread2 = new Thread(()->{
           Toolkit toolkit = Toolkit.getDefaultToolkit();
           for(int i = 0; i < 5; i++){
               toolkit.beep();
               try{
                   Thread.sleep(500);
               }catch (Exception e) {}
           }
        });
    }
}
