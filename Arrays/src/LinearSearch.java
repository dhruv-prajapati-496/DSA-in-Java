import java.util.*;
public class LinearSearch {
    public static int linearSearch(int[] arr, int k){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == k) return i;
        }
        return -1;
    }
    static void main() {
        int[] arr = {12,25,58,96,33,63,32,21,41,14,4,7,47,7,8,78,85};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter key Element: ");
        int k = sc.nextInt();
        if(linearSearch(arr,k) != -1){
            System.out.println("Key Element found at index: "+ linearSearch(arr,k));
        }
        else{
            System.out.println("Key Element is not found.");
        }
    }
}
