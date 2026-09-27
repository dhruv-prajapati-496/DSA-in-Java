import java.util.*;
public class FactorialOfANumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        long fact = 1;
        for(int i = 1; i<=n; i++){
            fact*=i;
        }
        System.out.println("Factorial of "+n+" is: "+fact);
    }
}
