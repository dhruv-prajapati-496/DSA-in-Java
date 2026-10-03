import java.util.*;
public class removeDuplicatesFromString {
    static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        String result = "";
        for(char ch : str.toCharArray()){
            if(result.indexOf(ch) == -1) result += ch;
        }
        System.out.println("Removed Duplicates : "+result);
    }
}
