import java.util.Scanner;
import java.util.Arrays;

public class p03748 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] dp_T = new int[N+1];
        int[] dp_F = new int[N+1];
        dp_T[0] = 1;
        dp_F[0] = 0;
        for (int i = 0; i < M; i++) {
            int[] prev_T = Arrays.copyOf(dp_T, dp_T.length);
            int[] prev_F = Arrays.copyOf(dp_F, dp_F.length);
            dp_T = new int[N+1];
            dp_F = new int[N+1];
            for (int j = 0; j < N; j++) {
                dp_T[j] = (prev_T[j+1] + prev_F[j+2]) % M;
                dp_F[j] = (prev_F[j+1] + prev_T[j+2]) % M;
            }
            dp_T[N] = (prev_T[N] + prev_F[N]) % M;
            dp_F[N] = (prev_F[N] + prev_T[N]) % M;
        }
        int answer = 0;
        for (int i = 0; i < N+1; i++) {
            answer += dp_T[i];
            answer %= M;
        }
        System.out.println(answer);
    }
}