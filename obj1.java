public class obj1 {
   int a,b; 

    obj1(int i,int j)
{
  a=i;
  b=j;

}
   obj1(obj1 s){
   a=s.a;
   b=s.b;
   a*=5;
   b/=9;
  
   }

   void display()
   {
    System.out.println("the result is here  "+ a+" "+ b);
   }
   public static void main(String[] args) {
      obj1 s1= new obj1(15, 29);
      obj1 s2= new obj1(s1);
      s1.display();
      s2.display();
   }


}

