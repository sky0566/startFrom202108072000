public class Code6_GetMax {

    public static int getMax(int[] arr){
        return process(arr, 0, arr.length-1);
    }

    public static int process(int[] arr, int L, int R){
        if(L == R) return arr[L];

        int mid = L + ((R - L)>>1);
        return Math.max(process(arr, L, mid), process(arr, mid+1, R));
    }

    public static void main(String[] args) {
        int[] aa = new int[]{1,2,4,5,6,3};
        System.out.println(getMax(aa));
    }
}
