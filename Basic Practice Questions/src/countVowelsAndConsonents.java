import java.util.*;
public class countVowelsAndConsonents {
     public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        int vowels = 0, consonents = 0;
        for(char ch : str.toCharArray()){
            if(ch == 'a' || ch == 'o' || ch == 'e' || ch == 'i' || ch == 'u'){
                vowels++;
            } else {
                consonents++;
            }

        }
         System.out.println("Vowels : "+ vowels);
         System.out.println("Consonents: "+ consonents);
    }
}
