class Solution {

    public int stair(int n, int[] dp) {
        if (n == 0) return dp[n] = 1;
        if (dp[n] != -1) return dp[n];
        int count = 0;
        if (n >= 1) count += stair(n - 1, dp);
        if (n >= 2) count += stair(n - 2, dp);
        return dp[n] = count;
    }

    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return stair(n, dp);
    }
}
