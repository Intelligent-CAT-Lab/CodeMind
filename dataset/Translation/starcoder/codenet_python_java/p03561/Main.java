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
                X[i] = (K+1)/2;
            }
            for (int i = N/2; i < N; i++) {
                if (X[i-1] == 1) {
                    X[i] = 1;
                } else {
                    X[i] = X[i-1] - 1;
                }
            }
            for (int i = 0; i < N; i++) {
                System.out.print(X[i] + " ");
            }
        }
    }
}