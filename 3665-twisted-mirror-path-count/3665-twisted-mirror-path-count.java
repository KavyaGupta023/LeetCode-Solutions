
class Solution {
    public int uniquePaths(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int mod = 1_000_000_007;

        int[][][] dp = new int[m][n][2];

        // Initialize starting cell only once
        dp[0][0][0] = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                for (int d = 0; d < 2; d++) {

                    int ways = dp[i][j][d];

                    if (ways == 0) continue;

                    if (grid[i][j] == 0) {

                        // Move right
                        if (j + 1 < n) {
                            dp[i][j + 1][0] =
                                (int)(((long)dp[i][j + 1][0] + ways) % mod);
                        }

                        // Move down
                        if (i + 1 < m) {
                            dp[i + 1][j][1] =
                                (int)(((long)dp[i + 1][j][1] + ways) % mod);
                        }

                    } else {

                        // Entered mirror while moving right
                        // Redirect down
                        if (d == 0 && i + 1 < m) {
                            dp[i + 1][j][1] =
                                (int)(((long)dp[i + 1][j][1] + ways) % mod);
                        }

                        // Entered mirror while moving down
                        // Redirect right
                        else if (d == 1 && j + 1 < n) {
                            dp[i][j + 1][0] =
                                (int)(((long)dp[i][j + 1][0] + ways) % mod);
                        }
                    }
                }
            }
        }

        return (int)(((long)dp[m - 1][n - 1][0]
                    + dp[m - 1][n - 1][1]) % mod);
    }
}
