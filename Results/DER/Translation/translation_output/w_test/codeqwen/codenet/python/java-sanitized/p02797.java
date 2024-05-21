import java.util.*;

public class p02797 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int S = scanner.nextInt();

        int[] A = new int[N];
        if (S == 1000000000) {
            for (int i = 0; i < N - K; i++) {
                A[i] = S - 1;
            }
        } else {
            for (int i = 0; i < N - K; i++) {
                A[i] = 1000000000;
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(A[i] + (i < N - 1 ? " " : ""));
        }
    }
}