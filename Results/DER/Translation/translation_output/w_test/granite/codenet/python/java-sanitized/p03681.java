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
            long result = ((long) factorial(N) * (long) factorial(M) * 2) % MAX;
            System.out.println(result);
        } else {
            long result = ((long) factorial(N) * (long) factorial(M)) % MAX;
            System.out.println(result);
        }
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}