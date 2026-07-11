class Solution {
    public static long countKdivPairs(int arr[], int k) {
        long count = 0;
        int[] freq = new int[k];

        for (int num : arr) {
            int rem = num % k;
            int complement = (k - rem) % k;

            count += freq[complement];
            freq[rem]++;
        }

        return count;
    }
}