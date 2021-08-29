import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] nums = { 0,0,1,1,1,2,2,3,3,4};
        int result = removeDuplicates(nums);
        System.out.println(result);
        System.out.println(Arrays.toString(nums));
        //[0,1,1,2,3,4,4,4]
        //
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static int getIndex(int[] nums){
        for(int i=0; i<nums.length; i++){
            if (nums[i] == -1) {
                return i;
            }
        }
        return nums.length;
    }
}
