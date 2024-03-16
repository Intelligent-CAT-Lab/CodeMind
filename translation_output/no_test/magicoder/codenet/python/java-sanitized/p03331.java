import java.util.Scanner;

public class p03331 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        long ans = Long.MAX_VALUE;
        for (int i = 1; i < N; i++) {
            ans = Math.min(ans, sumN(i) + sumN(N - i));
        }

        System.out.println(ans);
    }

    private static long sumN(int N) {
        long total = 0;
        int x = N;
        while (x > 0) {
            total += x % 10;
            x /= 10;
        }
        return total;
    }
}