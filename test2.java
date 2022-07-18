 // wap a programe to returning object
public class test2 {
    int a;
    test2(int i){
        a=i;
    }
    test2 increByTen(){
        test2 temp=new test2(a+10);
        return temp;
    }
    public static void main(String[] args) {
        test2 ob1= new test2(2);
        test2 ob2;
        ob2= ob1.increByTen();
        System.out.println("ob 2.a"+ob2.a);
    }
    
}
