public class Fibonacci {
    public static void printFibo(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        printFibo(a, b, n-1);
    }

    public static void main(String args[]) {
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 7; // number of terms in series
        printFibo(a, b, n - 2);
    }
}
