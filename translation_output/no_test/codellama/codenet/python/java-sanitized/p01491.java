import java.util.Scanner;

public class p01491 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        int m0 = scanner.nextInt();
        int md = scanner.nextInt();
        int n0 = scanner.nextInt();
        int nd = scanner.nextInt();

        int[] S = new int[M + 1];
        S[0] = m0;
        for (int i = 1; i < M; i++) {
            S[i] = (S[i - 1] * 58 + md) % (N + 1);
        }
        S[M] = (S[M - 1] * 58 + md) % (N + 1);

        int[] T = new int[N + 1];
        T[0] = n0;
        for (int i = 1; i < N; i++) {
            T[i] = (T[i - 1] * 58 + nd) % (M + 1);
        }
        T[N] = (T[N - 1] * 58 + nd) % (M + 1);

        int minValue = 1000000000;
        for (int i = 0; i < M + 1; i++) {
            for (int j = 0; j < N + 1; j++) {
                int value = (M - i) * (N - j) + S[i] + T[j];
                if (value < minValue) {
                    minValue = value;
                }
            }
        }

        System.out.println(minValue);
    }
}