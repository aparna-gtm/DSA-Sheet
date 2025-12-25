package Arrays;

class Leetcode_31 {
    public void nextPermutation(int[] nums) {
        int p=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i+1]>nums[i]){
                p=i;
                break;
            }
        }
        if(p==-1){
            reverse(nums,0,nums.length-1);
            return;
        }
        int q=0;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]>nums[p]){
                q=i;
                break;
            }
        }
        int temp=nums[p];
        nums[p]=nums[q];
        nums[q]=temp;

        // reverse the rest of array starting from p+1 position
        reverse(nums,p+1,nums.length-1);

    }
    public void reverse(int[] nums,int start,int end){
        
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}