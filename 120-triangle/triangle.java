class Solution {

    int[][] memo;

    int dp(List<List<Integer>> triangle, int i, int j) {

        if (i == triangle.size())
            return 0;

        if (memo[i][j] != Integer.MIN_VALUE)
            return memo[i][j];

        int left = dp(triangle, i + 1, j);
        int right = dp(triangle, i + 1, j + 1);

        memo[i][j] = triangle.get(i).get(j) + Math.min(left, right);

        return memo[i][j];
    }

    public int minimumTotal(List<List<Integer>> triangle) {

        int n = triangle.size();

        memo = new int[n][n];

        for (int[] row : memo)
            Arrays.fill(row, Integer.MIN_VALUE);

        return dp(triangle, 0, 0);
    }
}