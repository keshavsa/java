/*
 Make two threads implementing Runnable interface, one display the name of english months at the interval 
of 1 seconds and other displays the name of days at the interval of 1.5 seconds.
 */
// First Thread class to display the name of months in a year..
class ThreadFirst implements Runnable{
    public void run(){
       
        String month[] = {"January", "February", "March", "April", "May"};
        for(String m : month){
            System.out.println(m);
           try{
               Thread.sleep(1000);
        }catch(Exception e){
                System.out.println(e);
            
        }
    }  
  }
  }
  // Second Thread class to display the name of the days in a week..
  class ThreadSecond implements Runnable{
      public void run(){
      String days[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
      for(String d: days){
          System.out.println(d);
          try{
              Thread.sleep(1500);
          }catch(Exception e){
              System.out.println(e);
          }
          
      }
  }
  }
  // Main class..
  public class ThreadFirst1 {
      public static void main(String[] args) {
          ThreadFirst tf = new ThreadFirst();
          Thread t1 = new Thread(tf);
          t1.start();
          
          ThreadSecond ts = new ThreadSecond();
          Thread t2 = new Thread(ts);
          t2.start();
      }
  }