
class MyRunnable implements Runnable{

    @Override
    public void run() {
  System.out.println("under run method");
    }
    
}
public class TestRunnable{
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread t = new Thread(mr);
        t.start();


        
    }
    
}
