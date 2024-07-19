public class ClearBit {
    public static void main(String args[]){
        int n = 5;
         int pos = 2;
         int bitmask = 1<<pos;
         int Notbitmask = ~(bitmask);

         int Newnumber = Notbitmask & n;
         System.out.println(Newnumber);

    }
}
