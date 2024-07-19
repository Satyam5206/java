public class Bubblesort {
    public static void  PrintArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        
        int arr[] = {7,8,3,1,2};
        // time complexity = o(n^a)
        for(int i =0;i<arr.length-1;i++){
            for( int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    // Swap
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        PrintArr(arr);
    }
}
