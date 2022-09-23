import java.io.*;
public class ContentOfDirectory {
    public static void main(String[] args) throws IOException{
        File f = new File("Users/modacharya/NetBeansProjects/BIM");
        File[] allcontent = f.listFiles();
        
        for(File object: allcontent){
           if(object.isFile())
               System.out.println("File Name: "+ object.getName());
           else if(object.isDirectory())
               System.out.println("Directory Name: "+ object.getName());
   }
}
}
    

