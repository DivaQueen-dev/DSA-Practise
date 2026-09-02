class Solution {
    public int solve(int n, String s) {
        int[] state = new int[26];
        int occupied = 0;
        int ans = 0;

        for (char ch : s.toCharArray()) {
            int idx = ch - 'A';

            if (state[idx] == 0) {
                if (occupied < n) {
                    occupied++;
                    state[idx] = 1;
                } else {
                    ans++;
                    state[idx] = -1;
                }
            } else { 
                if (state[idx] == 1) {
                    occupied--;
                }
            }
        }

        return ans;
    }
}