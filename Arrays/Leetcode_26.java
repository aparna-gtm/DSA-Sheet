package Arrays;

class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        int si=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]!=nums[i]){
                nums[si++]=nums[i];
                k++;
            }
        }
        nums[si]=nums[nums.length-1];
        k++;
        return k;
    }
}