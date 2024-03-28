import java.util.*;
public class p03386 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt();
        int[] X = new int[K];
        int[] Y = new int[K];
        for(int i = 0; i < K; i++) {
            X[i] = A + i;
        }
        for(int i = 0; i < K; i++) {
            Y[i] = B - K + 1 + i;
        }
        int[] ans = new int[K * 2];
        for(int i = 0; i < K; i++) {
            ans[i] = X[i];
        }
        for(int i = 0; i < K; i++) {
            ans[K + i] = Y[i];
        }
        Arrays.sort(ans);
        for(int i = 0; i < K * 2; i++) {
            System.out.println(ans[i]);
        }
    }
}