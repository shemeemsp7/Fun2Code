import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class MissingNumber {

    public static void main(String[] args) {
        int nums[] = {1,2,6,4,5,7,2,9,6};
        System.out.println(findDisappearedNumbers(nums));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missingNumbers = new ArrayList<Integer>();
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++){
            //int index = Math.abs(nums[i]) -1;
            if(nums[i-1] == nums[i]){
                nums[i]=-1;
            }
        }
        System.out.println(Arrays.toString(nums));
        return missingNumbers;
    }

    // public static List<Integer> findDisappearedNumbers(int[] nums) {
    //     List<Integer> missingNumbers = new ArrayList<Integer>();
    //     Set<Integer> numbers = new HashSet<Integer>();
    //     for(int num: nums) {
    //         numbers.add(num);
    //     }

    //     for(int i=1; i<= nums.length; i++){
    //         if(!numbers.contains(i)){
    //             missingNumbers.add(i);
    //         }
    //     }
    //     return missingNumbers;
    // }
}