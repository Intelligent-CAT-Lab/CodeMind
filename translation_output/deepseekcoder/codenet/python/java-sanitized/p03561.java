import java.util.Scanner;

public class p03561 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int N = scanner.nextInt();
        if (K % 2 == 0) {
            System.out.print(K / 2);
            for (int i = 1; i < N; i++) {
                System.out.print(" " + K);
            }
        } else {
            int[] X = new int[N];
            for (int i = 0; i < N; i++) {
                X[i] = (K + 1) / 2;
            }
            for (int i = 0; i < N / 2; i++) {
                if (X[N - 1] == 1) {
                    N--;
                } else {
                    X[N - 1]--;
                    for (int j = N; j < N + K - 1; j++) {
                        X[j] = K;
                    }
                    N = N + K - 1;
                }
            }
            for (int i = 0; i < N; i++) {
                System.out.print(" " + X[i]);
            }
        }
    }
}