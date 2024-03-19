import java.util.*;

public class p03748 {
    final static int MOD = (int) (1e9 + 7);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        long[] dpT = new long[N + 1];
        long[] dpF = new long[N + 1];

        Arrays.fill(dpT, 0);
        Arrays.fill(dpF, 1);
        dpT[0] = 1;
        dpF[0] = 0;

        for (int i = 0; i < M; i++) {
            long[] prevT = dpT.clone();
            long[] prevF = dpF.clone();
            dpT = new long[N + 1];
            dpF = new long[N + 1];

            // èµ¤ã¯èµ¤ã0åã«ãªããããªåæç¶æ
            for (int j = 0; j < N; j++) {
                dpT[j] = prevT[j] + prevF[j + 1];
            }

            // èµ¤é
            for (int j = 1; j < N; j++) {
                dpF[j] = prevF[j] + prevT[j - 1];
            }

            // éèµ¤
            for (int j = 0; j < N - 1; j++) {
                dpT[j + 1] = prevT[j + 1] + prevF[j];
            }

            // éé
            for (int j = 1; j < N - 1; j++) {
                dpF[j + 1] = prevF[j + 1] + prevT[j];
            }

            dpT %= MOD;
            dpF %= MOD;
        }

        long answer = dpT[N] % MOD;
        System.out.println(answer);
    }
}