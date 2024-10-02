import java.util.*;
public class ArraySorting {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int array1[]=new int[n];
        for (int i = 0; i < n; i++) {
            array1[i] = sc.nextInt();
        }
        Arrays.sort(array1);
        int maxDifference = 0;
        for (int j = 1; j < n; j++) {
            int difference = array1[j] - array1[j - 1];
            maxDifference = Math.max(maxDifference, difference);
        }
        System.out.println(maxDifference);
    }
}
