import java.util.Scanner;

public class p03420 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        long s = 0;
        for (int b = K + 1; b <= N; b++) {
            long an = 0;
            long j = N / b;
            an = j * (b - K);

            if (N % b > 0) {
                long x1 = j * b + K;
                if (K == 0) {
                    x1 += 1;
                }
                long x2 = Math.min(N, (j + 1) * b - 1);
                if (x2 >= x1) {
                    an += (x2 - x1 + 1);
                }
            }
            s += an;
        }
        System.out.println(s);
    }
}