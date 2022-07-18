// ANother damdar example of constructor

public class student1 {
    student1(String name, String address, int roll, int age){
        System.out.println("the name of this nigga is "+name);
       System.out.println("The address of this nigga is "+address);
       System.out.println("The rool of this nigga is "+roll);
       System.out.println("the age of this nigga is "+age);
    }

    public static void main(String[] args) {
        student1 s1=new student1("keshav", "Bharatpur-04-chitwan", 1,21);
        student1 s2 = new student1("monica", "Bharatpur-04- adita chowk chitwan" ,2,20);
    }
    
}
