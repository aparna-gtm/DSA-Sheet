class Solution {
    public int[] selectionSort(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int mini=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[mini]>nums[j]){
                    mini=j;
                }
            }
            int temp=nums[i];
            nums[i]=nums[mini];
            nums[mini]=temp;
        }
        return nums;
    }
}