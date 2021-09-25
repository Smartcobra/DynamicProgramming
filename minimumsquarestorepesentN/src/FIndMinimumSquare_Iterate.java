public class FIndMinimumSquare_Iterate {

    public static int getMinSquare(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        if (n == 0) {
            return 0;
        }
        for (int i = 1; i <= n; i++) {
            int minAns = Integer.MAX_VALUE;
            for (int j = 1; j*j<=i; j++) {
                int curAns = dp[i - (j * j)];
                if (curAns < minAns) {
                    minAns = curAns;
                }
            }
            dp[i]=1+minAns;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 41;

        System.out.println(getMinSquare(n));
    }
}
