import java.util.Scanner;

public class p01491 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
        S = sort(S);
        for (int i = 0; i < M; i++) {
            S[i + 1] += S[i];
        }

        int[] T = new int[N + 1];
        T[0] = n0;
        for (int i = 1; i < N; i++) {
            T[i] = (T[i - 1] * 58 + nd) % (M + 1);
        }
        T = sort(T);
        for (int i = 0; i < N; i++) {
            T[i + 1] += T[i];
        }

        int minValue = 1000000000000000000L;
        for (int i = 0; i < M + 1; i++) {
            for (int j = 0; j < N + 1; j++) {
                int value = (M - i) * (N - j) + S[i] + T[j];
                if (value < minValue) {
                    minValue = value;
                }
            }
        }

        System.out.println(minValue);
    }

    public static int[] sort(int[] arr) {
        int[] sorted = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sorted[i] = arr[i];
        }
        for (int i = 0; i < sorted.length - 1; i++) {
            for (int j = i + 1; j < sorted.length; j++) {
                if (sorted[i] > sorted[j]) {
                    int temp = sorted[i];
                    sorted[i] = sorted[j];
                    sorted[j] = temp;
                }
            }
        }
        return sorted;
    }
}