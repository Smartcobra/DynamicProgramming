public class MinimumStepsTo1Recursive {

    public int getMinSteps(int n) {
        if (n == 1) {
            return 0;
        }
        int ans1 = Integer.MAX_VALUE;
        int ans2 = Integer.MAX_VALUE;
        int ans3 = Integer.MAX_VALUE;

        ans1 = getMinSteps(n - 1);
        if (n %2 == 0) {
            ans2 = getMinSteps(n/2);
        }
        if (n % 3 == 0) {
            ans3 = getMinSteps(n/3);
        }
        return Math.min(ans1, Math.min(ans2, ans3)) + 1;

    }

    public static void main(String[] args) {
        int n = 10;
        MinimumStepsTo1Recursive mr = new MinimumStepsTo1Recursive();
        System.out.println(mr.getMinSteps(10));
    }
}
