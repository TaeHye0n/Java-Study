package sec12_thread.exam06.sub04_wait_notify_notifyAll;

public class ProducerThread extends Thread{
    private DataBox dataBox;

    public ProducerThread(DataBox dataBox){
        this.dataBox = dataBox;
    }

    @Override
    public void run(){
        for(int i = 1; i <= 3; i++){
            String data = "Data-" + i;
            dataBox.setData(data);
        }
    }
}
