/*write a program to input integer and check it is prime or composite
 * then print the prime number upto entered number nigga?
 */

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
/**
 * prime
 */
public class prime {
    static int even(int i){
       
     for (int j = 0; j<=i; j++) {
        if(j%2==0)
        j=i;
       
        
     }
     return j;
 
    }
static int chk(int a){

    if(a%2==0)
    System.out.println("this is a even number");
    else{
        System.out.println("this is not a even");
    }
}
    
    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
        System.out.println("Enter the number nigga:");
        int y=myObj.nextInt();
        System.out.println(prime(y));


    }   
}