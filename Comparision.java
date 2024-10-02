import java.util.*;
public class Comparision {
    public static void greatestNumber(int a, int b){
        if(a>b){
            System.out.println(a+"is greatest ");
        }
        else if (b > a){
            System.out.println(b+"is greatest ");
        }
        else{
            System.out.println("Both numbers are equal");
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 2 Number: ");
        int a =sc.nextInt();
        int b =sc.nextInt();
        greatestNumber(a,b);
    }
}
