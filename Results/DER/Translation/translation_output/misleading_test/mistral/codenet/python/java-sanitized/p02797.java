import java.util.*;

public class p02797 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int S = sc.nextInt();

        int[] A = new int[N];
        Arrays.fill(A, S);

        if (S == Integer.MAX_VALUE) {
            for (int i = 0; i < N - K; i++) {
                A[i] = S - 1;
            }
        } else {
            for (int i = 0; i < N - K; i++) {
                A[i] = Integer.MAX_VALUE;
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(A[i] + " ");
        }
    }
}