
import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] nums = {2,4,6,33,5,3,77,8,5,6,88,9,0};

        System.out.println("Before Sorting - ");
        Arrays.stream(nums).forEach(val -> System.out.print(" " + val));
        nums = bubbleSort(nums);
        System.out.println("\nAfter Sorting - ");
        Arrays.stream(nums).forEach(val -> System.out.print(" " + val));

    }

    public static int[] bubbleSort(int[] nums){

        for(int lastSortedIndex = nums.length - 1; lastSortedIndex > 0; lastSortedIndex--){
            for (int i = 0; i < lastSortedIndex; i++) {

                if(nums[i] > nums[i+1]){
                    nums[i] = nums[i] ^ nums[i + 1];
                    nums[i + 1] = nums[i] ^ nums[i + 1];
                    nums[i] = nums[i] ^ nums[i + 1];
                }
            }
        }
        return nums;
    }

}
