class Solution {
    public boolean isPossible(int[] arr, int s, int x) {

        long[] seq = new long[arr.length + 1];

        seq[0] = s;
        long prefixSum = s;

        for (int i = 0; i < arr.length; i++) {
            seq[i + 1] = prefixSum + arr[i];
            prefixSum += seq[i + 1];
        }

        for (int i = seq.length - 1; i >= 0; i--) {
            if (seq[i] <= x) {
                x -= seq[i];
            }
        }

        return x == 0;
    }
}