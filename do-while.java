import java.util.Scanner;
public class do-while {

    public static void main(String[] args) {
       int i=1,n,b,c,d;
        Scanner myObj =new Scanner(System.in);
        System.out.println("Enter the username");
        int n=myObj.nextInt();
        b=0;
        c=1;
        d=1;
        do{
           i++;
           System.out.println(b);
           c=d;
           d=b;
           b=d+c;
            
        }
        while(n>=i);
        
    }
}