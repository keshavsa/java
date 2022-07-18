// this is a constructer example;

public class student {
        

    //create a constructor
    student(String name, int roll){
        System.out.println("The name is: "+name);
        System.out.println("The roll is :"+roll);
    }
    public static void main(String[] args) {
        student s1= new student("keshav",1);
        student s2= new student("monica",2);
    }
}
