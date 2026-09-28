import java.util.*;
class LCMOfTwoNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        int x = a, y = b;
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        int gcd = x;
        System.out.print("LCM is: ");
        System.out.print((x*y)/gcd);
    }
}
