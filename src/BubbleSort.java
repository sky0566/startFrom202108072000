public class BubbleSort {

    public static void bubbleSort(int[] arr){
        if (null == arr || arr.length<2) return;
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    swap(arr, i, j);
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j){
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^arr[j];
    }

    public static void main(String[] args) {
        int[] aa = new int[]{3,2,4,5,6,1};
        bubbleSort(aa);
        for (int a:aa){
            System.out.print(a);
        }
    }

}
