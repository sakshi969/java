import java.util.*;
public class average {
    public static double averageOf(int a, int b, int c) {
        double avg = (a + b + c) / 3.0;
        return avg;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter 3 number: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double result = averageOf(a, b, c);
        System.out.println("The average of the three numbers is: " + result);
    }
}
