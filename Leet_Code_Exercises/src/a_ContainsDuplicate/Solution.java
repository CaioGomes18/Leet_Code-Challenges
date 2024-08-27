package a_ContainsDuplicate;

import java.util.Arrays;

public class Solution {
	public static boolean hasDuplicate(int[] nums) {
       Arrays.sort(nums);
       int n = nums.length;
       for(int i=1; i < n; i++) {
    	   if(nums[i] == nums[i-1]) {
    		   return true;
    	   }
       }
       return false;
    }
}
