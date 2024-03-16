import java.util.Scanner;

public class p02625 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        long[] d = new long[n + 1];
        final long MOD = (long) 1e9 + 7;

        d[0] = 1;
        for (int i = 1; i <= n; i++) {
            d[i] = ((long) (m - i + 1) * ((m - n + i - 1) * d[i - 1] + i * d[i - 2] * (m - i))) % MOD;
        }

        System.out.println(d[n]);

        sc.close();
    }
}