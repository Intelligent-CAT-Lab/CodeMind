import java.util.Scanner;

public class p03418 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        long count = 0;

        for (int i = K + 1; i <= N + 1; i++) {
            count += ((N + 1) / i) * (i - K);
            count += Math.max(0, (N + 1) % i - K);
        }

        if (K == 0) {
            count -= (N - K);
        }

        System.out.println(count);
    }
}