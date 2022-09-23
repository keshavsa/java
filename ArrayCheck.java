/*Checj the number between 15 to 30 from the array..*/

public class ArrayCheck {
    public static void main(String[] args) {
        int arr[] = {21, 3, 15, 98, 24, 10, 80, 60, 11, 23};
        System.out.println("The Numbers between 15 and 30 are: ");
        for(int i : arr){
            if(i>=15 && i<=30)
                System.out.println(i);
        }
    }
}
