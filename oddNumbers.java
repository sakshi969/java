import java.util.*;
public class oddNumbers {
    public static int sumOfOdd(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if((i%2)!=0){
                sum=sum+i;
            }
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n =sc.nextInt();
        int result= sumOfOdd(n);
        System.out.println("Sum of odd numbers up to " + n + " is: " + result);
    }
}
