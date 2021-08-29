import java.util.Arrays;

public class RemoveElement {
    
    public static void main(String[] args) {

        int[] nums = { 0,1,2,2,3,0,4,2};
        int result = removeElement(nums, 2);
        System.out.println(result);
        System.out.println(Arrays.toString(nums));
    }
  
    public static int removeElement(int[] nums, int val) {
        int j = 0;
        for(int i=0;i < nums.length; i++){
            if(nums[i] != val){
                nums[j]=nums[i];
                j++;
            }
        }
       return j;
    }

    // public static void swapNums(int[] nums, int startIndex) {
    //     int finalLength=nums.length-startIndex;
    //     System.out.println(finalLength);
    //     for (int j = startIndex; j < nums.length; j++) {
    //             nums[j] = nums[j + 1];
    //     }
    // }

    // public static int getIndex(int[] nums){
    //     for(int i=0; i<nums.length; i++){
    //         if (nums[i] == -1) {
    //             return i;
    //         }
    //     }
    //     return nums.length;
    // }
}
