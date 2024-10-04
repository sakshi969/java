import java.util.*;
public class array {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int array1[]=new int[n];
        for (int i = 0; i < n; i++) {
            array1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int array2[]=new int[m];
        for (int i = 0; i < m; i++) {
            array2[i] = sc.nextInt();
        }
        int[] mergedArray = new int[n+m];
        for (int i = 0; i < n; i++) {
            mergedArray[i] = array1[i];
        }
        for (int i = 0; i < m; i++) {
            mergedArray[n + i] = array2[i];
        }
        System.out.println("Merged Array: ");
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }
        Arrays.sort(mergedArray);
        System.out.println("Sorted Merged Array:");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }
}
