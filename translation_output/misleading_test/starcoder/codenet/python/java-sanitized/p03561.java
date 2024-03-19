import java.util.*;
public class p03561 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        if (K % 2 == 0) {
            for (int i = 0; i < N; i++) {
                System.out.print(K/2 + " ");
            }
        } else {
            int[] X = new int[N];
            for (int i = 0; i < N/2; i++) {
                X[i] = K/2 + 1;
            }
            for (int i = N/2; i < N; i++) {
                X[i] = K;
            }
            for (int i = 0; i < N; i++) {
                System.out.print(X[i] + " ");
            }
        }
    }
}