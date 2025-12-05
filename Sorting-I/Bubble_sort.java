import java.util.*;

class Bubble_sort {
    public static void main(String[] args) {
       
        int[] nums = { 6, 5, 4, 3, 2, 1 };

        for (int i = nums.length; i >= 0; i--) {
            int f = 0;
            for (int j = 1; j < i; j++) {
                if (nums[j - 1] > nums[j]) {
                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                    f = 1;
                }
            }
            if (f == 0) {
                break;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}