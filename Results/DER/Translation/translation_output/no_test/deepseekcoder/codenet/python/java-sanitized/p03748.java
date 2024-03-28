import java.util.Scanner;

public class p03748 {
    static final long MOD = (long)Math.pow(10, 9) + 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        long[] dpT = new long[N+1];
        long[] dpF = new long[N+1];

        dpT[0] = 1;
        dpF[0] = 0;

        for (int i = 0; i < M; i++) {
            long[] prevT = dpT.clone();
            long[] prevF = dpF.clone();
            dpT = new long[N+1];
            dpF = new long[N+1];

            for (int j = 1; j < N; j++) {
                dpT[j] = (prevT[j-1] + dpT[j-1]) % MOD;
                dpF[j] = (prevF[j+1] + dpF[j+1]) % MOD;
            }

            dpT[0] = prevF[1];
            dpF[0] = prevF[0];

            for (int j = 1; j < N; j++) {
                dpT[j] = (dpT[j] + prevT[j-1]) % MOD;
                dpF[j] = (dpF[j] + prevF[j+1]) % MOD;
            }

            dpT[0] = (dpT[0] + prevF[1]) % MOD;
            dpF[0] = (dpF[0] + prevF[0]) % MOD;

            for (int j = 1; j < N; j++) {
                dpT[j] = (dpT[j] + prevT[j]) % MOD;
                dpF[j] = (dpF[j] + prevF[j]) % MOD;
            }
        }

        long answer = 0;
        for (int i = 0; i <= N; i++) {
            answer = (answer + dpT[i]) % MOD;
        }

        System.out.println(answer);
    }
}