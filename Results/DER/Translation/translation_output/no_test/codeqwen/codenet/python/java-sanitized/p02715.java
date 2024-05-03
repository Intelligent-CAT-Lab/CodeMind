import java.util.Scanner;

public class p02715 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int P = (int) Math.pow(10, 9) + 7;
        int[] X = new int[K + 1];
        long ans = 0;
        for (int i = 1; i <= K; i++) {
            X[i] += i;
            for (int j = i * 2; j <= K; j += i) {
                X[j] -= X[i];
            }
            ans += (long) X[i] * Math.pow(K / (double) i, N, P);
        }
        System.out.println(ans % P);
    }
}