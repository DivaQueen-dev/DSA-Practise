class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int res=arr[0];
        int maxele=arr[0];
        for(int i=1 ;i<arr.length;i++){
            maxele=Math.max((maxele+arr[i]), arr[i]);
            res=Math.max(maxele,res);
        }
        return res;
    }
}
