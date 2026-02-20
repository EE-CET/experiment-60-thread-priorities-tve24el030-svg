class PriorityThread extends Thread {
    public void run() {
    
    }
}

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        // TODO: Create three threads (t1, t2, t3)
        PriorityThread t1=new PriorityThread();
        PriorityThread t2=new PriorityThread();
        PriorityThread t3=new PriorityThread();
        // TODO: Set priorities
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        
        // TODO: Print priorities in the required format
        System.out.println("Thread 1 Priority: " + t1.getPriority());
        System.out.println("Thread 2 Priority: " + t2.getPriority());
        System.out.println("Thread 3 Priority: " + t3.getPriority());
    }
}
