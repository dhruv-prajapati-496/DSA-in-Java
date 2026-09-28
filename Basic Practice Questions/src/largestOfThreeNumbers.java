import java.util.*;
public class largestOfThreeNumbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three Numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.println("Maximum Number is: "+ Math.max(Math.max(a,b),c));
    }
}
