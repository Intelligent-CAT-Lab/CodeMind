import java.util.*;

public class p02797 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int S = scanner.nextInt();

        ArrayList<Integer> A = new ArrayList<>(Collections.nCopies(N, S));
        if (S == 1000000000) {
            for (int i = 0; i < N - K; i++) {
                A.set(i, S - 1);
            }
        } else {
            for (int i = 0; i < N - K; i++) {
                A.set(i, 1000000000);
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(A.get(i) + " ");
        }
    }
}