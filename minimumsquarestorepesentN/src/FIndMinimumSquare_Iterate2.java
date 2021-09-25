public class FIndMinimumSquare_Iterate2 {

    public static int getMinSquare(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        if (n == 0) {
            return 0;
        }
       /* for (int i = 1; i <= n; i++) {
            dp[i]=i;
            for (int j = 1; j*j<=i; j++) {
                dp[i]=Math.min(dp[i],1+dp[i-j*j]);
            }
        }*/

        for (int i = 1; i <= n; i++) {
            dp[i]=i;
            for (int j = 1; j<=Math.ceil(Math.sqrt(i)); j++) {
                int tmp=j*j;
                if(tmp>i){
                    break;
                }else {
                    dp[i]=Math.min(dp[i],1+dp[i-tmp]);
                }

            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 41;

        System.out.println(getMinSquare(6));
    }
}
