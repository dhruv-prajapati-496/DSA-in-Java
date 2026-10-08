import java.util.*;
public class binarySearch {
    static int BinarySearch(int[] arr, int k,int st,int end){
        while(st<=end){
            int mid = st + (end-st)/2;
            if(arr[mid] == k){
                return mid;
            } else if (arr[mid]>k) {
                end = mid -1;
            } else st = mid +1;
        }
        return -1;
    }
    static void main(String[] args) {
        int[] arr = {1,25,65,76,85,95,99,101,106,156,196,199,200,204,206,343,435,789};
        System.out.println("Enter Key Value: ");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int ans = BinarySearch(arr,k,0,arr.length-1);
        if(ans != -1){
            System.out.println("Element is Found at index : "+ans);

        } else System.out.println("Element not found.");
    }
}
