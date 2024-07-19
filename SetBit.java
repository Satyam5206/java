public class SetBit {
    public static void main(String args[]){
        int n = 5;
        int pos = 1;
        int bitmask = 1<<pos;

         int Newnumber =  bitmask|n;
         System.out.println(Newnumber);
    }
}
