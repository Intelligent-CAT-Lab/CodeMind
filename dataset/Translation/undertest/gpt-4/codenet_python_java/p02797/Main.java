import java.util.Scanner;

public class p02797 {
    private static final int INF = 1000000009; // replaced float INF with integer INF

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        int S = in.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = S; // Fill the array with S
        }

        if (S == 1000000000) {
            for (int i = 0; i < N - K; i++) {
                A[i] = S - 1;
            }
        } else {
            for (int i = 0; i < N - K; i++) {
                A[i] = INF;
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(A[i] + (i < N-1 ? " " : "\n"));
        }

        in.close();
    }
}