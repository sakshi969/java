import java.util.*;
public class maxminArray {
    public static int getMax(int num[],int n){
        int maxi=Integer.MIN_VALUE;
        for(int i=0; i<n;i++){
            if(num[i]>maxi){
                maxi=num[i];
            }
        }
        return maxi;
    }
    public static int getMin(int num[],int n){
        int mini=Integer.MAX_VALUE;
        for(int i=0; i<n;i++){
            if(num[i]<mini){
                mini=num[i];
            }
        }
        return mini;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int numbers[]= new int[size];
        for(int i=0; i<size;i++){
            numbers[i]=sc.nextInt();
        }
        System.out.println("The maximum value in the array is: " + getMax(numbers, size));
        System.out.println("The minimum value in the array is: " + getMin(numbers, size));
    }
}
