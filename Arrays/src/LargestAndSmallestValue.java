import java.util.*;
public class LargestAndSmallestValue {
    public static int getLargest(int[] numbers){
        int maxValue = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > maxValue) maxValue = number;

        }
        return maxValue;
    }
    public static int getSmallest(int[] numbers){
        int minValue = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < minValue) minValue = number;

        }
        return minValue;
    }


    static void main(String[] args) {
        int[] numbers = {1,2,12,56,48,59,65,32,87,56,32,36,52,123,321,528,654,21,};
        System.out.println("Maximum Value in Array is: "+ getLargest(numbers));
        System.out.println("Minimum Value in Array is: "+ getSmallest(numbers));
    }
}
