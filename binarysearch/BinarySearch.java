import java.util.Arrays;

class BinarySearch {
    public static void main(String[] args) {
        int nums[] = {1,4,5,7,8,9,6};
        Arrays.sort(nums);
        System.out.println(bsRecursion(nums,0,nums.length-1,5));
    }
    public static int bsRecursion(int[] arr, int l, int r, int num){
        
        if(r >= l){
            int mid = (l + r) / 2;
            if(arr[mid] == num){
                return mid;
            }

            if(num >arr[mid]){
                return bsRecursion(arr, mid+1, r, num);
            }

            if(num <arr[mid]){
                return bsRecursion(arr, l, mid-1, num);
            }
        }

        return -1;
    }
    public static int search(int[] array, int num) {
        Arrays.sort(array);
        int low = 0;
        int high = array.length;
        int mid = 0;
        while (low <= high) {
            mid = (low + high  )/ 2;
             if( array[mid] == num) {
                return mid;
             }
            if (num > array[mid]) {
                low = mid + 1;
            } else if (num < array[mid]){
                high = mid - 1;
            }
        }
        return -1;
    }
}