import java.util.*;
public class Factorial {

    public static void printFactorial(int n){
        if(n<0){
            System.out.println("Invalid Requst");
            return;
        }
        int Factorial = 1;
        for(int i=n;i>=1;i--){
            Factorial = Factorial*i;
        }
        System.out.println(Factorial);
        return;
    }
    public static void main(Strings args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFactorial(n);
    }
}
