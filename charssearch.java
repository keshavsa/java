public class charssearch {
    public static void main(String[] args) {
        String s1="this is a demo of the getChar";
        int start=10;
        int end=14;
        char buf[]= new char[end-start];
        s1.getChars(start, end, buf, 0);
        System.out.println(buf);
    
    }
    
}