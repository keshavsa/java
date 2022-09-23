//Object returning //
/**
 * oReturning
 */
public class oReturning {

  oReturning(oReturning o)
  {
    System.out.println("the sum of number is"+c);
  }
  oReturning(int i, int j)
  {
 int c;
 c=i+j;
 oReturning temp= new oReturning();
 temp=c;
 return oReturning;
  }
  public static void main(String[] args) {
    oReturning s1= new oReturning(4, 5);
    s1.test(); 
  }
}