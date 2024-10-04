import java.util.*;
public class power {
    public static double raisePower(int x, int n){
        return Math.pow(x, n);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(x + " raised to the power of " + n + " is: " + raisePower(x,n));
    }
}
