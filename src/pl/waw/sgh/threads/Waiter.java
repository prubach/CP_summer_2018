package pl.waw.sgh.threads;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Waiter implements Runnable {

    private Message msg;

    public Waiter(Message msg) {
        this.msg = msg;
    }

    private String getCurTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(new Date());
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " waiting to get notified at:" + getCurTime());
        synchronized (msg) {
            try {
                msg.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + " got notified at: " + getCurTime());
        System.out.println(name + " got msg: " + msg.getMsg());
    }
}
