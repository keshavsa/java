/*WAP to take employee id, name, addres, DOB, and phonenumber from user
and then store in a file called "Emp.txt". Also display the content of the file.
*/
package OldQ2017;
import java.io.*;
import java.util.*;
public class file1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        String id = sc.nextLine();
        
        System.out.println("Enter Employee Name: ");
        String name = sc.nextLine();
        
        System.out.println("Enter Employee Address: ");
        String address = sc.nextLine();
           // Write the employee details in the "Empt.txt"..
           FileWriter fw = new FileWriter("Emp.txt");
           fw.write(id);
           fw.write(name);
           fw.write(address);
           fw.flush();
           fw.close();
           // Read data from the file..
           File f = new File("Emp.txt");
           char ch[]= new char[(int)f.length()];
           FileReader fr = new FileReader(f);
           fr.read(ch);
           System.out.println(ch);
       
           fr.close();
          
       }
   }