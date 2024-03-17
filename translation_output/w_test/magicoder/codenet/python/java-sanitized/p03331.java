import java.util.Scanner;

public class p03331 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        int ans = Integer.MAX_VALUE;
        for (int i = 1; i < N; i++) {
            ans = Math.min(ans, sumN(i) + sumN(N - i));
        }

        System.out.println(ans);
    }

    private static int sumN(int N) {
        int total = 0;
        while (N > 0) {
            total += N % 10;
            N /= 10;
        }
        return total;
    }
}