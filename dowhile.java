import java.util.Scanner;
public class dowhile {

    public static void main(String[] args) {
       int i=1,b,c,d;
        Scanner myObj =new Scanner(System.in);
        System.out.println("Enter the number that you want get febonacci ");
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
        while(b<=n);
        
    }
}