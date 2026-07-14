package MultiThreading;



class MyThread extends Thread{
    @Override
    public void run() {
        for(int i = 0; i < 6; i++){
            System.out.println(i);
            // try {
            //     Thread.sleep(2000);
            // } catch (InterruptedException e) {
            //     e.printStackTrace();
            // }
        }
        // System.out.println("Thread class");
    }
}


class NewThread implements Runnable{
    public void run(){
        for(int i = 6; i < 11; i++){
            System.out.println(i);
            // try {
            //     Thread.sleep(5000);
            // } catch (InterruptedException e) {
            //     e.printStackTrace();
            // }
        }
    }
}


public class MultiThreadingDemo {
    public static void main(String[] args){

        // sequential
        // task1();
        // task2();

        
        //thread mode 
        // thread class
        MyThread t1 = new MyThread();
        t1.start();
       
 System.out.println("main class1");

        // runnable interface
        NewThread task = new NewThread();
        Thread t = new Thread(task);
        t.start();
        try{
            t.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
         // wait for the thread to finish before continuing
         System.out.println("main class2");

    }

     static void task1(){
        for(int i = 0; i < 6; i++){
            System.out.println(i);
        }
     }

     static void task2(){
        for(int i = 6; i < 10; i++){
            System.out.println(i);
        }
     }
}
