class Solution {
    static final int MOD = 1000000007;

    public int prefixStrings(int n) {

        long[] fact = new long[2 * n + 1];
        fact[0] = 1;

        for (int i = 1; i <= 2 * n; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
        }

        long numerator = fact[2 * n];

        long denominator = (fact[n] * fact[n]) % MOD;
        denominator = (denominator * (n + 1)) % MOD;

        return (int) ((numerator * modPow(denominator, MOD - 2)) % MOD);
    }

    private long modPow(long a, long b) {
        long res = 1;

        while (b > 0) {
            if ((b & 1) == 1)
                res = (res * a) % MOD;

            a = (a * a) % MOD;
            b >>= 1;
        }

        return res;
    }
}