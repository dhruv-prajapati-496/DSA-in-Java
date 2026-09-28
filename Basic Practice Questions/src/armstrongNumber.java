import java.util.*;
public class armstrongNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        int temp = n, sum = 0,count = 0;
        while(n!=0){
            n/=10; count++;
        }
        n = temp;
        while(n!=0){
            int digit = n%10;
            sum+= Math.pow(digit,count);
            n/=10;
        }
        System.out.println( sum == temp ? "Armstrong Number" : "Not an Armstrong Number");
    }
}
