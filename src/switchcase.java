import java.util.*;
public class switchcase {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        char operation=sc.next().charAt(0);
        switch(operation){
            case '+':System.out.println(a+b);
                break;
            case '*':System.out.println(a*b);
                break;
            case '/':System.out.println(a/b);
                break;
            default:System.out.println("Invalid");
        }
    }
}

