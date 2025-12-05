

import java.util.*;
class Insertion_Sort
{
	public static void main(String[] args) {
	    
	    int[] nums = { 6, 5, 4, 3, 2, 1,1 };
		for(int i=1;i<nums.length;i++){
            int j=i;
            int f=0;
            while(j>0 && nums[j-1]>nums[j]){
                int temp=nums[j-1];
                nums[j-1]=nums[j];
                nums[j]=temp;
                f=1;
                j--;
            }
            if(f==0){
                break;
            }
        }
        System.out.println(Arrays.toString(nums));
	}
}