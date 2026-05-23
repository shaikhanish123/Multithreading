public class SleepExample {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Thread is going to sleep for 5 seconds.");
        Thread.sleep(5000);
        System.out.println("Thread woke up after sleeping.");
    }
}
