//optimized the solution with no help 
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i<nums.length; i++){ //pick first number 
            for(int j=i+1; j<nums.length; j++){//pick second m=number 
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};   //this will return indices 
                }

            }
        }
        return new int[]{-1, -1};//array creation inside return statement. new int[]{...} creates a array instantly
    }   
}
