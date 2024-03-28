import java.util.Scanner;

public class p03331 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long ans = 1000000000000L;
        for (int i = 1; i < N; i++) {
            ans = Math.min(ans, sumN(i) + sumN(N - i));
        }
        System.out.println(ans);
    }

    private static long sumN(int n) {
        long total = 0;
        while (n > 0) {
            total += n % 10;
            n = n / 10;
        }
        return total;
    }
}