import java.util.*;
public class fibonacciSeries {
    static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci Series of first "+n+" terms: ");
        int a = 0, b = 1;
        for(int i = 0; i<n; i++){
            System.out.print(a+ " ");
            int c = a+b;
            a = b;
            b = c;
        }
    }
}
