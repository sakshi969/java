import java.util.*;
public class countofnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positiveCount = 0, negativeCount = 0, zeroCount = 0;
        char choice;
        do {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
            System.out.print("Do you want to enter another number? (y/n): ");
            choice = sc.next().charAt(0);  // Reads the next character input
        } while (choice == 'y' || choice == 'Y');  // Continue if the user enters 'y' or 'Y'

        System.out.println("Count of positive numbers: " + positiveCount);
        System.out.println("Count of negative numbers: " + negativeCount);
        System.out.println("Count of zeros: " + zeroCount);
    }
}