package Arrays;
import java.util.*;
class Leetcode_1 {
    public int[] twoSum(int[] nums, int target) {
        int[] ans={-1,-1};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int needed=target-nums[i];
            if(map.containsKey(needed)){
                ans[0]=map.get(needed);
                ans[1]=i;
                return ans;
            }
            else{
                map.put(nums[i],i);
            }
        }
        return ans;
    }
}