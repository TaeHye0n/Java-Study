package chap12_thread.exam04;

public class User2 extends Thread{
    private Calculator calculator;

    public void setCalculator(Calculator calculator){
        setName("User2");
        this.calculator = calculator;
    }

    @Override
    public void run(){
        calculator.setMemory(50);
    }
}