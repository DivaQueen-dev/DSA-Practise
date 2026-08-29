class Solution {
    static final int MOD = 1000000007;

    int countSubsequences(String s, int n) {
        long[] dp = new long[n];

        for (char ch : s.toCharArray()) {
            int digit = ch - '0';

            long[] next = dp.clone();

            // Start a new subsequence
            next[digit % n] = (next[digit % n] + 1) % MOD;

            // Extend existing subsequences
            for (int r = 0; r < n; r++) {
                if (dp[r] == 0) continue;

                int newRem = (r * 10 + digit) % n;
                next[newRem] = (next[newRem] + dp[r]) % MOD;
            }

            dp = next;
        }

        return (int) dp[0];
    }
}