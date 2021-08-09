public class Code3_InsertSort {

    public static void insertSort(int[] arr){
        if (null == arr || arr.length<2) return;
        for (int i=1;i<arr.length;i++){
            for (int j=i-1;j>=0 && arr[j+1]<arr[j];j--){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;

            }
        }
    }
    public static void main(String[] args) {
        int[] aa = new int[]{3,2,4,5,6,1};
        insertSort(aa);
        for (int a:aa){
            System.out.print(a);
        }
    }

}
