package pl.waw.sgh.threads;

public class MyThread extends Thread {

    private String name;
    private int iterator;

    private OurThreads ourThreads;
    private Thread nextThread;

    public MyThread(String name, OurThreads ourThreads) {
        this.name = name;
        this.ourThreads = ourThreads;
    }

    public MyThread(String name, OurThreads ourThreads, Thread nextThread) {
        this.name = name;
        this.ourThreads = ourThreads;
        this.nextThread = nextThread;
    }

    @Override
    public void run() {
        try {
            // With join everything is executed sequentially
            //if (nextThread!=null) nextThread.join();
            while (iterator < 10) {
                iterator++;
                System.out.println(name + " it=" + iterator);
                ourThreads.increase(name);
                this.sleep(500);
            }
        } catch (InterruptedException ie) {
            System.out.println("Thread " + name + " interrupted!");
        }
    }

}