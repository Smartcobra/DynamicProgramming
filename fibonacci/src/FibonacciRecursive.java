import java.util.Scanner;

public class FibonacciRecursive {
    public int getFibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        int ans1=getFibonacci(n-1);
        int ans2=getFibonacci(n-2);

        return ans1+ans2;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        FibonacciRecursive fr= new FibonacciRecursive();
        System.out.println(fr.getFibonacci(n));
    }
}
