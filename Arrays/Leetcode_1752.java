package Arrays;

class Leetcode_1752 {
    public boolean check(int[] nums) {
        int peak=0;
        for(int i=0;i<nums.length-1;i++){
            if(peak>1){
                return false;
            }
            if(nums[i+1]<nums[i]){
                peak++;
            }
        }
        if(peak==0 || ( peak==1  && nums[0]>=nums[nums.length-1]) ){
            return true;
        }
        return false;
    }

}