import java.util.*;
public class CheckPrimeNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number: ");
        int n; n = sc.nextInt();
        boolean prime = true;
        if(n<=1) prime = false;
        for(int i = 2; i < Math.sqrt(n); i++){
            if(n%i==0){
                prime = false;
                break;
            }
        }
        System.out.println(prime ? n+" is Prime" : n+ " is Not Prime");
    }
}
