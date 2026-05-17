class MyThread1 extends Thread{
    public void run(){
        for(int k=0;k<5;k++){
            System.out.println(" run Thread is running"+k);
        }

    }


}
public  class ThreadExample{
    public static void main(String [] args){
        MyThread1 t1=new MyThread1();
        System.out.println("Thread is created");
        t1.start();
    }
}