import java.util.*;
public class linearSearch {
    static int LinearSearch(int[] arr, int k){
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i]==k){
                return i;
            }
        }
        return -1;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Elements: ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter key Element: ");
        int k = sc.nextInt();
        if(LinearSearch(arr,k)!=-1){
            System.out.println("Element Found at index "+ LinearSearch(arr,k));
        }else {
            System.out.println("Elements Not Found");
        }
    }
}
