public class Recursion3 {
    public static int calcPower(int x,int n) {
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
         int xPower1 = calcPower(x, n-1);
         int xPowern = x*xPower1;
         return xPowern;
    }
    public static void main(String args[]){
int x=5,n = 13;
int ans = calcPower(x, n);
System.out.println(ans);
       
    }
}
