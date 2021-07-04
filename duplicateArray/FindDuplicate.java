import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class FindDuplicate {
    public static void main(String[] args) {
        int nums[] = {1,9,5,7,8 ,9,6,};
        System.out.println(containsDuplicateSorted(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet= new HashSet<Integer>(nums.length);
		for (int num: nums ){
            if(numSet.contains(num)) { return true;}
            numSet.add(num);
        }
        return false;
    }

    //first sort the array - then find any adjascent values are equal
    public static boolean containsDuplicateSorted(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++){
            //int index = Math.abs(nums[i]) -1;
            if(nums[i-1] == nums[i]){
                return true;
            }
        }
        return false;
    }
}