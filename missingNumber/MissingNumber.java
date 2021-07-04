
class MissingNumber {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};
        //System.out.println(missingNumber(nums));
        System.out.println( 5 ^ 7);
        System.out.println( 5 | 7);
        System.out.println( 5 & 7);

    }

    public static int missingNumber(int[] nums) {
        int missing = nums.length;
        for (int i = 0; i < nums.length; i++) {
            System.out.println(i ^ nums[i]);
            missing ^= i ^ nums[i];
        }
        return missing;
    }
}
