public class hah2 {
 String black; int a;


 hah2 (string hah, int j){
    black=hah;
    a=j;
 }
 hah2 doubleinsize(){
    hah2 temp=new hah2(black, a*2);
    return temp;
 }
 public static void main(String[] args) {
    hah2 ob1= new hah2("red",55);
    hah2 ob2;
    ob2=ob1.doubleinsize();
    System.out.println(ob.a, ob.black);
 }

    
}
