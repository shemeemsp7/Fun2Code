import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class  SumofTwo {

    public static void main(String[] args) {
        int nums[] = {11,15,2,9};
        int target = 9;
        //System.out.println(Arrays.toString(twoSum(nums, target)));
        System.out.println(isTwoSumAvailable(nums, target));
    }
    //find the index of numbers - which will add up to a given target value.
    //if we dont need index we should use set instead of hashmap
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int length = nums.length;
        Map<Integer, Integer> indexMap= new HashMap<Integer,Integer>();
        for (int i=0; i< length; i++ ) {
            int diff = target-nums[i];
            if(!indexMap.containsKey(diff)){
                indexMap.put(nums[i], i);
            }else{
                result[0]=indexMap.get(diff);
                result[1]=i;
                break;
            }
        }
        return result;
    }

    public static boolean isTwoSumAvailable(int[] nums, int target) {
        int length = nums.length;
        Set<Integer> set= new HashSet<Integer>();
        for (int i=0; i< length; i++ ) {
            int diff = target-nums[i];
            if(!set.contains(diff)){
                set.add(nums[i]);
            }else{
                return true;
            }
        }
        return false;
    }
}