package chap12_thread.exam04;

public class User1 extends Thread{
    private Calculator calculator;

    public void setCalculator(Calculator calculator){
        setName("User1");
        this.calculator = calculator;
    }

    @Override
    public void run(){
        calculator.setMemory(100);
    }
}
