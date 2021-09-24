public class MinimumStepsTo1Memoization {

    public static int getMinSteps(int n,int memo[]){

        if(n==1){
            return 0;
        }
        if(memo[n]!=-1){
            return memo[n];
        }

        int res=getMinSteps(n-1,memo);

        if(n%2==0){
            res=Math.min(res,getMinSteps(n/2,memo));
        }

        if(n%3==0){
            res=Math.min(res,getMinSteps(n/3,memo));
        }
        memo[n]=res+1;

        return memo[n];
    }

    public static int  getMinSteps(int n){
        int memo[]=new int[n+1];
        for(int i=0;i<memo.length;i++){
            memo[i]=-1;

        }
        return getMinSteps(n,memo);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(getMinSteps(n));
    }
}
