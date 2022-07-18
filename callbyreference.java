public class callbyreference {
    int a,b;

    

callbyreference(int i, int j){
    a=i;
    b=j;

}
//pass an object
void meth(callbyreference o){
    o.a*=2;
    o.b/=2;
}
public static void main(String[] args) {
    callbyreference hello = new callbyreference(24, 25);
    hello.meth(hello);
    System.out.println("ob.a and ob.b after call "+ob.a+" "+ob.b);
}
}