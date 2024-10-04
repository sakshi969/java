import java.util.*;
public class Fibonacci {
    public static int fibonacciSeries(int n){
        if (n == 0) return 0;
        if (n == 1) return 1;
        int a= 0, b = 1;
        int sum=0;
        for(int i=2;i<=n;i++){
            sum = a + b;
            a=b;
            b=sum;
        }
        return b;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the position n to find the Fibonacci number: ");
        int n = sc.nextInt();
        System.out.println("The Fibonacci number at position " + n + " is: " + fibonacciSeries(n));
    }
}
