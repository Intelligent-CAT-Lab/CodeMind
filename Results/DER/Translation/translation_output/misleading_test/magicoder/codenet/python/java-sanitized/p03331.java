import java.util.Scanner;

public class p03331 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        long ans = Long.MAX_VALUE;
        for (int i = 1; i < N; i++) {
            ans = Math.min(ans, sumDigits(i) + sumDigits(N - i));
        }

        System.out.println(ans);
    }

    private static long sumDigits(int n) {
        long total = 0;
        while (n > 0) {
            total += n % 10;
            n /= 10;
        }
        return total;
    }
}