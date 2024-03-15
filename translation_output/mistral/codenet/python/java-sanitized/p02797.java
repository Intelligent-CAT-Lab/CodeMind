import java.util.*;
import java.util.stream.Collectors;

public class p02797 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int S = scanner.nextInt();

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

        Arrays.stream(A).forEach(System.out::print);
        System.out.println();
    }
}