public class Code7_MergeSort {

    public static void mergeSort(int[] arr){
        if (null == arr || arr.length<2) return;
        process(arr, 0, arr.length-1);
    }

    public static void process(int[] arr, int L, int R){
        if (L == R) return;
        int mid = L + ((R-L)>>1);
        process(arr, L, mid);
        process(arr, mid+1, R);
        merge(arr, L, mid, R);
    }

    public static void merge(int[] arr, int l, int m, int r){
        int[] helper = new int[r - l +1];
        int i = 0;
        int p1 = l;
        int p2 = m+1;
        while (p1<=m && p2<=r){
            helper[i++] = arr[p1] <= arr[p2]?arr[p1++]:arr[p2++];
        }
        while (p1<=m){
            helper[i++] = arr[p1++];
        }
        while (p2<=r){
            helper[i++] = arr[p2++];
        }
        for (i=0;i<helper.length;i++){
            arr[l+i] = helper[i];
        }
    }

}
