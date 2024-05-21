import java.util.*;
public class p03681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int MAX = 100000007;
        int diff = N - M;
        if (Math.abs(diff) > 1) {
            System.out.println(0);
        } else if (diff == 0) {
            long factN = factorial(N);
            long factM = factorial(M);
            long result = (factN * factM * 2) % MAX;
            System.out.println(result);
        } else {
            long factN = factorial(N);
            long factM = factorial(M);
            long result = (factN * factM) % MAX;
            System.out.println(result);
        }
    }
    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}