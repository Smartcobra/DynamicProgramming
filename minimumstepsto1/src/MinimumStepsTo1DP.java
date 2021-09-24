public class MinimumStepsTo1DP {

    public static int getMinSteps(int n){
        int dp[] = new int[n+1];

        dp[1]=0;
        for(int i=2;i<=n;i++){
            int minVal=dp[i-1];
            if(i%2==0){
                minVal=Math.min(minVal,dp[i/2]);
            }
            if(i%3==0){
                minVal=Math.min(minVal,dp[i/3]);
            }
            dp[i]=minVal+1;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(getMinSteps(14));
    }
}
