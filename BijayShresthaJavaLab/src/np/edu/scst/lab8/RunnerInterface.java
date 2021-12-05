/*
     WAP to create 3 threads by implementing Runnable interface. 
    Each thread should individually print a loop containing its name and priority.
 */
package np.edu.scst.lab8;


public class RunnerInterface implements Runnable{

    @Override
    public void run() {
        RunnerInterface.print();
    }
    public static void print(){
         for(int i =0; i<10; i++){
            System.out.println("Name: "+Thread.currentThread().getName()+" Priority: "+Thread.currentThread().getPriority());
            try{Thread.sleep(1000); }catch(InterruptedException e){}
        }
    }
    public static void main(String[] args) {
        RunnerInterface m = new RunnerInterface();
        Thread t1 = new Thread(m);
        t1.setPriority(10);
        Thread t2 = new Thread(m);
        t2.setPriority(7);
        Thread t3 = new Thread(m);
        t3.setPriority(8);
        
        t1.start();
        t2.start();
        t3.start();
        RunnerInterface.print();
    }

    
    
}
