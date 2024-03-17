import java.util.*;

public class p03748 {
    final static int mod = (int) 1e9 + 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();

        long[] dpT = new long[n + 1];
        long[] dpF = new long[n + 1];

        Arrays.fill(dpT, 0);
        Arrays.fill(dpF, 1);
        dpT[0] = 1;
        dpF[0] = 0;

        for (int i = 0; i < m; i++) {
            long[] prevT = dpT.clone();
            long[] prevF = dpF.clone();
            dpT = new long[n + 1];
            dpF = new long[n + 1];

            // èµ¤èµ¤
            for (int j = 0; j < n; j++) {
                dpT[j] = prevT[j] + prevF[j + 1];
            }

            // èµ¤é
            for (int j = 1; j < n; j++) {
                dpF[j] = prevF[j] + prevT[j - 1];
            }

            // éèµ¤
            for (int j = 0; j < n - 1; j++) {
                dpT[j + 1] = prevT[j + 1] + prevF[j];
            }

            // éé
            for (int j = 1; j < n - 1; j++) {
                dpF[j + 1] = prevF[j + 1] + prevT[j];
            }

            dpT[n] %= mod;
            dpF[n] %= mod;
        }

        long answer = dpT[n] % mod;
        System.out.println(answer);
    }
}