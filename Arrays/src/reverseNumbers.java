import java.util.*;
public class reverseNumbers {
    public static void reverseArray(int[] array){
        int first = 0, last = array.length -1;
        while(first<last){
            int temp = array[first];
            array[first] = array[last];
            array[last] = temp;
            first++; last--;
        }
    }
    static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9};
        reverseArray(numbers);
        for(int i : numbers){
            System.out.print(i+" ");
        }
    }
}
