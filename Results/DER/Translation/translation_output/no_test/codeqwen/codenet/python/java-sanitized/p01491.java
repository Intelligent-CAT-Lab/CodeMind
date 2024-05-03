import java.util.Arrays;
import java.util.Scanner;

public class p01491 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    public static void solve(Scanner scanner) {
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
        Arrays.sort(S);
        for (int i = 0; i < M; i++) {
            S[i + 1] += S[i];
        }

        int[] T = new int[N + 1];
        T[0] = n0;
        for (int i = 1; i < N; i++) {
            T[i] = (T[i - 1] * 58 + nd) % (M + 1);
        }
        Arrays.sort(T);
        for (int i = 0; i < N; i++) {
            T[i + 1] += T[i];
        }

        int min = Integer.MAX_VALUE;
        int j = N;
        for (int i = 0; i <= M; i++) {
            while (j > 0 && calc(S, T, i, j) > calc(S, T, i, j - 1)) {
                j--;
            }
            min = Math.min(min, calc(S, T, i, j));
        }
        System.out.println(min);
    }

    private static int calc(int[] S, int