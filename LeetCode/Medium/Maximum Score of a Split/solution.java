class Solution {
    public long maximumScore(int[] nums) {
        int n = nums.length;
        int[] min = new int[n];
        min[n - 1] = nums[n - 1];
        for(int i = n - 2; i > 0; i--) {
            min[i] = Math.min(min[i + 1], nums[i]);
        }
        long ans = nums[0] - min[1], prefix_sum = nums[0];
        for(int i = 1; i < n - 1; i++) {
            prefix_sum += nums[i];
            ans = Math.max(ans, prefix_sum - min[i + 1]);
        }
        return ans;
    }
}