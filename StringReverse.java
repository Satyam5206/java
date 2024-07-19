public class StringReverse {
    public static void StringRev(String str,int idx){
        if(idx==0){
            System.out.print(str.charAt(idx)+" ");
            return;
        }
        System.out.print(str.charAt(idx)+" ");
        StringRev(str, idx-1);
    }
    public static void main(String args[]){
        String str="Hello";
        StringRev(str, str.length()-1);
    
    }
}
