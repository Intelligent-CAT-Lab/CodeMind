import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long MOD = 100000007;
        long[] dp_T = new long[N+1];
        long[] dp_F = new long[N+1];
        dp_T[0] = 1;
        dp_F[0] = 0;
        for (int i = 0; i < M; i++) {
            long[] prev_T = dp_T;
            long[] prev_F = dp_F;
            dp_T = new long[N+1];
            dp_F = new long[N+1];
            // èµ¤èµ¤
            for (int j = 0; j < N; j++) {
                dp_T[j] += prev_T[j+1];
                dp_F[j] += prev_F[j+2];
            }
            dp_T[N] += prev_F[N+1];
            // èµ¤é
            for (int j = 0; j < N; j++) {
                dp_T[j] += prev_T[j];
                dp_F[j] += prev_F[j+1];
            }
            dp_T[0] += prev_F[0];
            // éèµ¤
            for (int j = 0; j < N; j++) {
                dp_T[j+1] += prev_T[j];
                dp_F[j+1] += prev_F[j];
            }
            // éé
            for (int j = 0; j < N; j++) {
                dp_T[j+1] += prev_T[j];
                dp_F[j+1] += prev_F[j];
            }
            for (int j = 0; j <= N; j++) {
                dp_T[j] %= MOD;
                dp_F[j] %= MOD;
            }
        }
        long answer = 0;
        for (int i = 0; i <= N; i++) {
            answer += dp_T[i];
        }
        answer %= MOD;
        System.out.println(answer);
    }
}