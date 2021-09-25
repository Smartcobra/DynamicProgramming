public class FIndMinimumSquare_Memoization {

    public static int getMinSquare(int n,int []dp){
        if(n==0){
            return 0;
        }
        int i;
        int minAns=Integer.MAX_VALUE;
        for (i=1;i*i<=n;i++){
            int curAns;
            if(dp[n-(i*i)]==-1){
                curAns=getMinSquare(n-(i*i),dp);
                dp[n-(i*i)]=curAns;
            }else{
                curAns =dp[n-(i*i)];
            }
            if(curAns<minAns){
                minAns=curAns;
            }
        }
        return minAns+1;
    }

    public static void main(String[] args) {
        int n=41;
        int[] dp= new int[n+1];
        for(int i=0;i<n;i++){
            dp[i]=-1;
        }
        System.out.println(getMinSquare(n,dp));
    }
}
