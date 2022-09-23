

 public class MyExceptionClass extends Exception{
     
    MyExceptionClass(String s){
        super(s);
    }
}

 class OwnExceptionClass {
    static void checkException(int age) throws MyExceptionClass{
        if(age<18)
        throw new MyExceptionClass("Not Vote");
        else
            System.out.println("Valid to Vote");
    }
    public static void main(String[] args) {
        try{
        checkException(12);
        }catch(MyExceptionClass e){System.out.println(e);}
    }
}