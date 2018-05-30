package pl.waw.sgh.threads;

public class OurThreads {

    private int ourIterator = 0;

    static final int NUM_THREADS = 5;

    // Try also without synchronized!!!
    public synchronized void increase(String threadName) {
        ourIterator++;
        System.out.println("Thread " + threadName + " out iter: " + ourIterator);
    }

    public static void main(String[] args) {
        OurThreads ourThreads = new OurThreads();
        MyThread[] myThreads = new MyThread[NUM_THREADS];
        Thread prevThread = null;
        for (int i=0;i<NUM_THREADS;i++) {
            //myThreads[i] = new MyThread("T_"+i, ourThreads);
            myThreads[i] = new MyThread("T_"+i, ourThreads, prevThread);
            prevThread = myThreads[i];
        }

        for (int i=0;i<NUM_THREADS;i++) {
            myThreads[i].start();
        }

    }

}
