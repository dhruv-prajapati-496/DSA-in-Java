import java.util.*;
public class binarySearch {
    public static int binarySearch(int[] numbers, int key){
        int st = 0, end = numbers.length-1;
        while(st<=end){
            int mid = st + (end - st)/2;
            if(numbers[mid] == key){
                return mid;
            } else if (numbers[mid]>key) {
                end = mid -1;
            }
            else {
                st = mid + 1;
            }
        } return -1;
    }
    static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,12,23,34,45,56,67,68,78,89,90};
        System.out.println("Enter Key value: ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        System.out.println("Key Element found at index: "+binarySearch(numbers,key));

    }
}
