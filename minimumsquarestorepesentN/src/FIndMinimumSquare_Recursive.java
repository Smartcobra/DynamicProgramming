public class FIndMinimumSquare_Recursive {

    public static int getMinSquare(int n){
        if(n==0){
            return 0;
        }
        int i;
        int minAns=Integer.MAX_VALUE;
        for (i=1;i*i<=n;i++){
            minAns=Math.min(minAns,getMinSquare(n-i*i));
        }
        return minAns+1;
    }

    public static void main(String[] args) {
        int n=6;

        System.out.println(getMinSquare(n));
    }
}
