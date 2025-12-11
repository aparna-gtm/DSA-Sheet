package Arrays;

class Leetcode_283 {
    public void moveZeroes(int[] nums) {
        int idx=0;
        int j=0;
        while(j<nums.length){
            if(nums[j]!=0){
                int temp=nums[idx];
                nums[idx]=nums[j];
                nums[j]=temp;
                idx++;
            }
            j++;
        }
    }
}