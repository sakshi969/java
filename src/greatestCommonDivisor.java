import java.util.*;
public class greatestCommonDivisor {
    public static int greatestDivisor(int a, int b){
        while(a>0&& b>0){
            if(a>b){
                a=a%b;
            }
            else b=b%a;
        }
        if(a==0)return b;
        return a;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println(" greatest common divisor of " + a + "and" + b + " is: " + greatestDivisor(a,b));
    }
}
