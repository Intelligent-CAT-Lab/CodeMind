import java.util.Scanner;

public class p03331 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long ans = 1000000000000L;
        for (int i = 1; i < N; i++) {
            ans = Math.min(ans, sum_N(i) + sum_N(N - i));
        }
        System.out.println(ans);
    }

    public static long sum_N(int N) {
        long total = 0;
        while (N > 0) {
            total += N % 10;
            N = N / 10;
        }
        return total;
    }
}