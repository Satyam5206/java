public class SelectionSort {
    public static void  PrintArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]= {7,8,3,1,2};
        for (int i = 0;i<arr.length-1;i++){
            int Smallest = i;
            for(int j=i+1 ;j<arr.length;j++){
                if(arr[Smallest]>arr[j]){
                    Smallest = j;
                }
            }
            int temp = arr[Smallest];
            arr[Smallest]=arr[i];
            arr[i]= temp;
        }
        PrintArr(arr);
    }
}
