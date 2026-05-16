class MyThread   extends Thread{
public void run(){
    System.out.println("Thread is running");
}

} 
public class TestThread{
    public static void main(String [] args){
        MyThread t1=new MyThread();
        System.out.println("Thread is created");
        t1.start();
    }
}
    