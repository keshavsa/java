// WAP to handle the ArrayIndexOutofBoundsException..
public class ExceptionHandling {
    public static void main(String[] args) {
       try{
        int arr[] = {1, 4, 6, 8, 10};
        arr[5] = 12;
        System.out.println(arr[5]);
        
       }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e); 
       }
        System.out.println("Rest of the code");
        
    }  
    }