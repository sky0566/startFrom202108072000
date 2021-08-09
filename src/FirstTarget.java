public class FirstTarget {

    public static int firstTarget(int[] arr, int target){
        if (target<arr[0] || target>arr[arr.length-1]) return -1;
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int mid = left + ((right - left)>>1);
            if (arr[mid] >= target){
                right = mid;
            }else{
                left = mid +1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,1,2,2,3,3,3,4,5,6,7};
        System.out.println(firstTarget(arr, 3));
    }

}
