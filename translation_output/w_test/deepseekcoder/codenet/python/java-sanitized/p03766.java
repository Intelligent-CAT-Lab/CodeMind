import java.util.Scanner;

public class p03766 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        if (n == 1) {
            System.out.println(1);
        } else {
            long[] res_v = new long[n + 1];
            long[] res_v_cumsum = new long[n + 1];
            res_v[0] = 0;
            res_v[1] = 1;
            res_v[2] = 1;
            res_v_cumsum[0] = 0;
            res_v_cumsum[1] = 1;
            res_v_cumsum[2] = 2;

            long M = 1000000007;

            for (int k = 3; k < n; k++) {
                res_v[k] = (1 + res_v_cumsum[k-1] - res_v[k-2]) % M;
                res_v_cumsum[k] = (res_v_cumsum[k-1] + res_v[k]) % M;
            }

            long result = ((res_v_cumsum[n-2] * (((n-1) * (n-1)) % M)) % M + ((res_v_cumsum[n-1] * (n-1)) % M) + n + (n-1)*(n-1)%M) % M;
            System.out.println(result);
        }
    }
}