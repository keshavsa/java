import javax.lang.model.util.ElementScanner14;

public class factorial {
    int fact (int n){
        int result;
       if (n>=1) 
       return n*fact(n-1);
        
        else 
        return 1;
    }
        
    
    public static void main(String[] args) {
        factorial f=new factorial();
        System.out.println("the factorial is "+f.fact(56));
    }
}

