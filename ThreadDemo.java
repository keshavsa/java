/*
Make a thread using runnable interface that can display the number 1 to 20 at 
the unterval of 2 seconds.
*/
public class ThreadDemo implements Runnable{
    public void run(){
        try{
            Thread t = Thread.currentThread();
            for(int i = 1; i <=20; i++){
            System.out.println(i);
            t.sleep(2000);
        }
    }catch(Exception e){
        e.printStackTrace();
    }
    }
    public static void main(String[] args) {
        try{
            ThreadDemo td = new ThreadDemo();
            Thread t = new Thread(td);
            t.start();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}