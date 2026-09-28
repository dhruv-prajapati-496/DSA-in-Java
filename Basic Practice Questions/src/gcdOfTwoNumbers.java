import java.util.*;
class gcdOfTwoNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.print("GCD is: ");
        System.out.println(a);
    }
}