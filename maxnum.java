 /* wap  that take 3 integer input from the user and calculate the
 maximum of the number & diplay it by usiing the return type method
 */
import java.util.Scanner;
/**
 * maxnum
 */
public class maxnum {

    static int max(int a, int b,  int c){
        int max;
        max=a;
        if (b>max)
        max=b;
        if(c>max)
        max=c;
        return max;
    }
    
    public static void main(String[] args) {
     
        Scanner myObj = new Scanner (System.in);
       System.out.println("Enter the three number homies:");
       int x=myObj.nextInt();
       int y=myObj.nextInt();
       int z=myObj.nextInt();
       System.out.println( "entered max number is:");
       System.out.println(max(x, y, z));
    }
}