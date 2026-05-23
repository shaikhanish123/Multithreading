class MyTask extends Thread {  
    public void run() {  
        System.out.println("Task is running by " + Thread.currentThread().getName());  
    }  
  
    public static void main(String[] args) {  
        MyTask t1 = new MyTask();  
        MyTask t2 = new MyTask(); // Create a new thread object for the same task  
  
        t1.start(); // First thread starts  
        t2.start(); // Second thread starts  
    }  
}  