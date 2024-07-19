import java.util.Scanner;

public class Function {
    public static int CalculateMul(int a ,int b){
        int Mul= a*b;
        return Mul;
    }
    public static void main(Strings args[]){
     Scanner sc = new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();
     int Mul = CalculateMul(a, b);
     System.out.println("Mul of two numbers is:"+Mul);
    }
}
