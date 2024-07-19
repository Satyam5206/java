public class Recursion {
    static int factorial(int n){
        if((n==0) || (n==1)){
            return 1;
        }else {
            return n*factorial(n-1);
        }
    }
    public static void main(String args[]){
        int x = 6;
        System.out.println("The factorail of the number is:"+ factorial(x));
    }
}
