import java.util.*;

public class p03561 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        int[] X = new int[N];
        Arrays.fill(X, K);
        if (K % 2 == 0) {
            for (int i = 0; i < N; i++) {
                System.out.print(X[i] + " ");
            }
        } else {
            for (int i = 0; i < N / 2; i++) {
                if (X[i] == 1) {
                    X[i] = 0;
                } else {
                    X[i]--;
                    for (int j = i + 1; j < N; j++) {
                        X[j] = K;
                    }
                }
            }
            for (int i = 0; i < N; i++) {
                System.out.print(X[i] + " ");
            }
        }
    }
}