import java.util.*;
public class secondLargestInTheArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++)
            arr[i] = sc.nextInt();
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for(int i : arr){
            if(i > first){
                second = first;
                first = i;
            } else if (i > second && i != first) {
                second = i;
            }
        }
        System.out.println("Second Largest is : "+ second);
    }
}
