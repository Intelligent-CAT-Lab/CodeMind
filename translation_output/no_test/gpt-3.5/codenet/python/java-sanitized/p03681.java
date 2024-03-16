import java.util.Scanner;

public class p03681 {
    static final long MAX = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int diff = N - M;

        long result = 0;
        if (Math.abs(diff) > 1) {
            result = 0;
        } else if (diff == 0) {
            result = (factorial(N) * factorial(M) * 2) % MAX;
        } else {
            result = (factorial(N) * factorial(M)) % MAX;
        }

        System.out.println(result);
    }

    static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = (result * i) % MAX;
        }
        return result;
    }
}