public class ThreadSchedulerExample implements Runnable {

    @Override
    public void run() {

        System.out.println(
            Thread.currentThread().getName()
            + " with priority "
            + Thread.currentThread().getPriority()
            + " is running."
        );
    }

    public static void main(String[] args) {

        ThreadSchedulerExample t1 = new ThreadSchedulerExample();
        ThreadSchedulerExample t2 = new ThreadSchedulerExample();
        ThreadSchedulerExample t3 = new ThreadSchedulerExample();
        ThreadSchedulerExample t4 = new ThreadSchedulerExample();
        ThreadSchedulerExample t5 = new ThreadSchedulerExample();

        Thread th1 = new Thread(t1, "thread1");
        Thread th2 = new Thread(t2, "thread2");
        Thread th3 = new Thread(t3, "thread3");
        Thread th4 = new Thread(t4, "thread4");
        Thread th5 = new Thread(t5, "thread5");

        th1.setPriority(1);
        th2.setPriority(2);
        th3.setPriority(3);
        th4.setPriority(4);
        th5.setPriority(7);

        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
    }
}