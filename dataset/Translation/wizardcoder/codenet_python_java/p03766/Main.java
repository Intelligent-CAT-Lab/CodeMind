import java.util.*;

public class p03766 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 1) {
            System.out.println(1);
            return;
        }

        int[] res_v = new int[n + 1];
        int[] res_v_cumsum = new int[n + 1];
        res_v[0] = 0;
        res_v[1] = 1;
        res_v[2] = 1;
        res_v_cumsum[0] = 0;
        res_v_cumsum[1] = 1;
        res_v_cumsum[2] = 2;

        int M = 1000000007;

        for (int k = 3; k <= n; k++) {
            res_v[k] = (1 + res_v_cumsum[k-1] - res_v[k-2]) % M;
            res_v_cumsum[k] = (res_v_cumsum[k-1] + res_v[k]) % M;
        }

        System.out.println((((res_v_cumsum[n-2] * (((n-1) * (n-1)) % M)) % M) + ((res_v_cumsum[n-1] * (n-1)) % M) + n + (n-1)*(n-1)%M) % M);
    }
}