public class ArrayTwice {

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(singleNonDuplicate(nums));

    }
    public static int singleNonDuplicate(int[] nums) {
        
        int length = nums.length;
        if(length == 1){
            return nums[0];
        }
        for(int i=0; i<length-1; i+=2 ){
            if(nums[i]!=nums[i+1]){
                return nums[i];
            }
        }
        if(length % 2 != 0){
            return nums[length-1];
        }
        return 0;
    }
    
}
