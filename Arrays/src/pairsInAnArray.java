import java.util.*;
public class pairsInAnArray {
    public static void printPairsOfAnArray(int[] array){
        for(int i = 0; i<array.length; i++){
            for(int j = i+1; j<array.length; j++){
                System.out.print("("+array[i]+","+array[j]+") ");
            } System.out.println();
        }
    }
    static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6};
        printPairsOfAnArray(numbers);
    }
}
