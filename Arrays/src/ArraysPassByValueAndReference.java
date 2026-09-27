import java.util.*;
public class ArraysPassByValueAndReference {
    static void change(int[] arr){
        for(int i = 0; i<arr.length; i++){
            arr[i]++;
        }
    }
    static void main() {
        int[] arr = {1,2,3,4};
        System.out.println("Values Before Change Function:");
        for(int i : arr){
            System.out.print(i+" ");
        }
        change(arr); // if you want to change it by value then pass a copy of arr by change(Arrays.copyOf(arr,arr.length));
        System.out.println("Value After Change Funtion: ");
        for(int i : arr){
            System.out.print(i+ " ");
        }
    }
}