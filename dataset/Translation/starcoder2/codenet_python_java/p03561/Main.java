import java.util.*;

public class p03561 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        if (K % 2 == 0) {
            for (int i = 0; i < N; i++) {
                System.out.print(K / 2 + " ");
            }
        } else {
            int[] X = new int[N];
            Arrays.fill(X, (K + 1) / 2);
            for (int i = 0; i < N / 2; i++) {
                if (X[N - 1] == 1) {
                    X = Arrays.copyOfRange(X, 0, N - 1);
                } else {
                    X[N - 1] -= 1;
                    X = Arrays.copyOf(X, N);
                }
            }
            for (int i = 0; i < N; i++) {
                System.out.print(X[i] + " ");
            }
        }
    }
}