import java.util.*;
public class UpdateBit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        int n= 5;
         int pos = 1;
         int bitmask = 1<<pos;
         if(oper==1){
            // Set
            int Newnumber = bitmask | n;
            System.out.println(Newnumber);
         }
         else {
            // Clear
            int Newbitmask= ~(bitmask);
            int Newnumber = Newbitmask&n;
            System.out.println(Newnumber);
         }
    }
}
