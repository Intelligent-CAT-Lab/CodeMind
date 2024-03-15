import java.util.Scanner;
import java.util.Arrays;

public class p02797 {

    private static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int S = scanner.nextInt();
        
        int[] A = new int[N];
        Arrays.fill(A, S);
        
        if (S == (int) Math.pow(10, 9)) {
            for (int i = 0; i < N - K; i++) {
                A[i] = S - 1;
            }
        } else {
            for (int i = 0; i < N - K; i++) {
                A[i] = (int) Math.pow(10, 9);
            }
        }
        
        for (int i = 0; i < N; i++) {
            System.out.print(A[i] + (i < N - 1 ? " " : "\n"));
        }

        scanner.close();
    }
}