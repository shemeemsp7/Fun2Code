import java.util.Arrays;

public class SortingAlgos {
    
    public static void main(String[] args) {
        int nums[] = {1,10,5,7,8,9,6};
        System.out.println(Arrays.toString(selectionSort(nums)));
    }

    public static int[] selectionSort(int[] array){
        //int result[] = new int[array.length];
        int length = array.length;
        for(int i=0; i < length-1; i++) {
            int minIndex = i;
            for(int j=i+1; j < length; j++ ){
                if(array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
        }
        System.out.println("#####" + Arrays.toString(array));
        return array;
    }
}
