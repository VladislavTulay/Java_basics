package thread;

import java.util.Date;

public class MultiThreadsExample implements Runnable{

    private int id;

    public MultiThreadsExample(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println(id + " - " + new Date().getTime());
    }

    public static void main(String[] args) throws InterruptedException {

        for(int i = 1; i <= 10; i++) {
            Thread separatedThread = new Thread(new MultiThreadsExample(i));
            separatedThread.start();
        }
    }
}