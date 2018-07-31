package test;

import java.util.concurrent.locks.ReentrantLock;

public class MyProgram implements Runnable {
    private static int value = 0;
    private ReentrantLock lock;
    public static int getValue() {
        return value;
    }

    @Override
    public void run() {
        for (int i=0; i<5; i++){
            synchronized (this){
                int v = value;

                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                value = v+5;
            }
        }

    }
}
