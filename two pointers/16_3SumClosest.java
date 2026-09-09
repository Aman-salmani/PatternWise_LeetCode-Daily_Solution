class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
         int minDiff = Integer.MAX_VALUE;
             int result = 0;
        for(int i = 0 ; i < n-2 ; i++){
            if(i > 0  && nums[i]==nums[i-1]){
                continue;
            }
            int left = i+1;
            int right = n-1;
            while(left < right){
                int sum = nums[i]+nums[left]+nums[right];
                int diff = Math.abs(sum-target);
                 if(sum==target){
                    result = sum;
                    return result;
                }
                if(diff < minDiff){
                    minDiff = diff;
                    result = sum;
                }
                if(sum < target){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return result;
    }
}