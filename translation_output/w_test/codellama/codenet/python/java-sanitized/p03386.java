import java.util.Scanner;

public class p03386 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt();
        sc.close();

        int[] X = new int[K];
        int[] Y = new int[K];

        for (int i = 0; i < K; i++) {
            X[i] = A + i;
            Y[i] = B - K + 1 + i;
        }

        int[] ans = new int[K * 2];
        for (int i = 0; i < K; i++) {
            ans[i] = X[i];
            ans[i + K] = Y[i];
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}