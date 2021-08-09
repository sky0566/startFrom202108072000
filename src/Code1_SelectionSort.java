import java.util.Arrays;

public class Code1_SelectionSort {

    public static void selectionSort(int[] arr){
        if(arr == null || arr.length<2) return;

        for (int i=0; i<arr.length-1;i++){
            int minIndex = i;
            for(int j=i+1;j<arr.length;j++){
                minIndex = arr[minIndex]>arr[j]?j:minIndex;
            }
            swap(arr, i, minIndex);
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void comparator(int[] arr){
        Arrays.sort(arr);
    }

}
