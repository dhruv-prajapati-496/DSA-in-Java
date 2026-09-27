import java.util.*;
public class checkPalindromeNumber {
    static void main() {
        System.out.println("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int rev = 0;
        while(n!=0){
            rev = rev*10 + n%10;
            n/=10;

        }
        System.out.println(rev==temp ? "Palindrome" : "Not Palindrome");
    }
}
