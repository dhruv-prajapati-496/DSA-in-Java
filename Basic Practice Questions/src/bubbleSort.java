import java.util.*;
public class bubbleSort {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Elements: ");
        for(int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<n-1; i++){
            for(int j = 0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
