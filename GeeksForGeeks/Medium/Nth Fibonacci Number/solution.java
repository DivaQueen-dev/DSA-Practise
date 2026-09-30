class Solution {
    static int nthFibonacci(int n) {
        return nthFibonacci(n, new int[n]);
    }
    static int nthFibonacci(int n, int[] arr) {
        if (n == 0 || n == 1) return n;
        if (arr[n-1] != 0) return arr[n-1];
        arr[n-1] = nthFibonacci(n - 1, arr) + nthFibonacci(n-2, arr);
        return arr[n-1];
    }
}