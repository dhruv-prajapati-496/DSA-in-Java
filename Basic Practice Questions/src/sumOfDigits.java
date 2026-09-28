import java.util.*;
public class sumOfDigits {
    static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),sum = 0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        System.out.println("Sum of digits : "+ sum);
    }
}
