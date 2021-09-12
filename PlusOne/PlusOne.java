import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int nums[] = {2,9};
        System.out.println(Arrays.toString(plusOne(nums)));
    }
    public static int[] plusOne(int[] digits) {
        int length = digits.length;
        for(int i=length-1; i>=0; i--){
            if(digits[i] < 9){
                digits[i]=digits[i]+1;
                return digits;
            }
            digits[i]=0;
        }

        int[] newArray = new int[length+1];
        newArray[0]=1;
        return newArray;
    }
}
