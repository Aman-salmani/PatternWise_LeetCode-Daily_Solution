class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int low = 0;
        int sum = 0;
        int n = arr.length;
        for(int i = 0 ; i< k ; i++){
             sum +=arr[i];
        }
        int max = sum;
        int high = k;
        while(high < n){
            sum = sum - arr[low] + arr[high];
            max = Math.max(sum, max);
            low++;
            high++;
        }
        return max;
    }
}