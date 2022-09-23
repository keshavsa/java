public class robj1 {
    int a;
    robj1(int i)
    {
        a=i;

    }
    robj1 increment(){
        robj1 temp= new robj1(a+10);
        return temp;

    }
    public static void main(String[] args) {
        robj1 ob1=new robj1(2);
        robj1 ob2;
        ob2=ob1.increment();
        System.out.println("ob2  "+ob2.a);

    }
}