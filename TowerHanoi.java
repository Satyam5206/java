public class TowerHanoi {
public static void TowerofHanoi(int n , String src,String helper,String dest){
    if(n==1){
        System.out.println("Transfer disk "+n+" from " +src+" to "+dest);
        return;
    }
    TowerofHanoi(n-1, src, dest, helper);
    System.out.println("Transfer disk "+n+" from " +src+" to "+dest);
    TowerofHanoi(n-1,helper,src,dest);
}
    public static void main(String args[]) {
  int n=2;
  TowerofHanoi(n,"S","H","D");
    }
}
