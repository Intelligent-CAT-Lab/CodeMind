import java.util.Scanner;

public class p03910 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int S = 0;
        for (int i = 1; i <= N; i++) {
            if (S >= N) {
                break;
            }
            S += i;
            A[S] = i;
        }
        int x = 0;
        for (int i = 0; i < N; i++) {
            x += A[i];
        }
        for (int i = 0; i < N; i++) {
            if (x == A[i]) {
                continue;
            }
            System.out.println(A[i]);
        }
    }
}